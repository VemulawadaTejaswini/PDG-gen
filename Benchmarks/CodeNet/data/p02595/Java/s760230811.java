import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();

		double x = 0;
		double y = 0;
		int result = 0;
		for(int i=0;i<N;i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			if(Math.sqrt(x*x+y*y)<= D) {
				result++;
			}
		}
		sc.close();

		System.out.println(result);

	}


}