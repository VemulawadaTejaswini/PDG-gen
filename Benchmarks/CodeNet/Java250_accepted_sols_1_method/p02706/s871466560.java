import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int sum = 0;
		int x[] = new int[M];
		for(int i = 0;i<M;i++){
			x[i] =sc.nextInt();
			sum+=x[i];
		}
		if(N<sum)
			System.out.println("-1");
		else
		System.out.println(N-sum);
			
	}

}
