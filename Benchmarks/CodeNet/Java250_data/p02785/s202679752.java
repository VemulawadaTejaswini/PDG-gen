import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long arr[] = new long[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLong();
		}
		Arrays.sort(arr);
		long atk = 0;
		for (int i = 0; i < arr.length-K; i++) {
			atk += arr[i];
		}
		System.out.println(atk);
      	sc.close();
    }
		
		
}
