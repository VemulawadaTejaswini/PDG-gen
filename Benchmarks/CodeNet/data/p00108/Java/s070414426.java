//Volume1-0108
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	//declare
	private static TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
    private static int[] a,b;
    private static int   n;

	public static void main(String[] args) {

		String[] s;
		int cnt;

        //input
        Scanner sc = new Scanner(System.in);
        while((n = Integer.parseInt(sc.nextLine())) != 0){
        	a  = new int[n];
        	s = sc.nextLine().split("\\s");
        	for(int i=0;i<n;i++){
        		a[i] = Integer.parseInt(s[i]);
        	}

        	//calculate
        	cnt = 0;
        	while(true){
        		tm.clear();
            	b  = new int[n];
        		cnt++;
        		for(int i=0;i<n;i++){b[i] = freq(i);}
        		if (Arrays.equals(a, b)){break;}
        		a = b;
       		}

        	//output
        	System.out.println(--cnt);
        	for(int i=0;i<n;i++){
        		System.out.print(a[i]);
        		if(i < n - 1){
        			System.out.print(" ");
        		} else {
                	System.out.println();
        		}
        	}
        }
	}

	private static int freq(int i){
		if(tm.get(i) != null){return tm.get(i);}
		int sum = 0;
		for(int k=0;k<n;k++){
			if(a[i] == a[k]){sum++;}
		}
		tm.put(i,sum);
		return sum;
	}
}