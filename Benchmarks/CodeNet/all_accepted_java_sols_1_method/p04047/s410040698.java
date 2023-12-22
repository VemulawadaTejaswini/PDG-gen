import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N  = sc.nextInt();
		
		int[] array = new int[2*N];
		
		for(int i = 0 ; i < 2*N ; i++){
			array[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(array);
		
		int sum = 0;
		for(int i = 1 ; i < 2*N ; i+=2){
			sum += Math.min(array[i], array[i-1]);
		}
		
		System.out.println(sum);
	}
}
