import java.util.*;


public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		for(;;){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] kou = new int[n];
			for(int i = 0; i < n; i++){
				kou[i] = scan.nextInt();
			}
			int max = Integer.MIN_VALUE;
			int sum = 0;
			for(int i = 0; i < n; i++){
				sum = kou[i];
				max = Math.max(sum, max);
				for(int j = i + 1;j < n; j++){
					sum += kou[j];
					max = Math.max(sum, max);
				}
				sum = 0;
			}
			System.out.printf("%d\n", max);
		}
	}
}