import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
    	Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] array = new int[N];
		
		for(int i=0;i<N;i++){
		    array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
		System.out.println(array[N-1]-array[0]);
	    
    }
}
