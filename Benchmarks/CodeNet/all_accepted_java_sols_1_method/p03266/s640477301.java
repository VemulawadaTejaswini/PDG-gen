import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long sum = 0;

		if(k%2 == 0) {
			sum += Math.pow(n/k, 3);
			sum += Math.pow((n+k/2)/k, 3);
		}else {
			sum += Math.pow(n/k, 3);
		}

		System.out.println(sum);

	}
}