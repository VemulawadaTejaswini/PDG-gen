import java.util.Scanner;

public class Main {

	static boolean[] vis = new boolean[60];

    public static void main(String[] args) throws Exception {

    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int sum = 0;
    	int[] ary = new int[N];
    	for(int i = 0; i < N; i++){
    		ary[i] = sc.nextInt();
    	}
    	sc.close();
    	int id = 0;
    	int max = ary[0];
    	for(int i = 0; i < N; i++){
    		if(ary[i] > max){
    			max = ary[i];
    			id = i;
    		}
    	}
    	for(int i = 0; i < N; i++){
    		if(i == id){
    			sum += ary[i] / 2;
    		}else{
    			sum += ary[i];
    		}
    	}
    	System.out.println(sum);
    }
}
