import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t = scanner.nextInt();
		long sum = 0;
		int[] x = new int[n];
		for(int i=0;i<n;i++){
			x[i] = scanner.nextInt();
			if(i != 0){
				if(x[i-1] + t > x[i]){
					sum += x[i] - x[i-1];
				}else{
					sum += t;
				}
			}
		}
		sum += t;
		System.out.println(sum);

	}

}
