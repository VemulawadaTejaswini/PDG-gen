import java.util.ArrayList;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true){
		int n = sc.nextInt();
		if(n == 0) break;
    	int fin = 104730;
    	int[] ary = new int[fin+1];
    	ary[0] = 0;
    	ary[1] = 0;
    	for(int i = 2 ; i < ary.length ; i++){
    		ary[i] = i;
    	}
    	int search = ary[2];

		 while(search <= Math.sqrt(fin)){
    		for(int i = search; i < ary.length ; i++){
    			if(i == search && ary[search] != 0) list.add(search) ;
    			if(i % search == 0) ary[i] = 0;
    		}
    		search++;
    	}
		 
    	for(int i = 0 ; i < ary.length ; i++){
    		if(ary[i] != 0) list.add(ary[i]);
    	}
    	int sum = 0;
    	for(int i = 0 ; i < n ; i++){
    		sum += list.get(i);
    	}
    	if(list.isEmpty()) sum = 0;
    	System.out.println(sum);
    	
		}
		sc.close();
	}
}