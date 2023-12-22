import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
        int count = 0;
        
        //初期化
        for(int i = 0; i < n; i++){
		    array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		
		int m = n/2;
		System.out.println(array[m]-array[m-1]);
    }
}