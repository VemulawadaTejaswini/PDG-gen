import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int i,n;
		double sum;
		double rec[];
		double a;

		while(true){
			n = sc.nextInt();
			if(n==0){
				break;
			}
			rec = new double[n];
			sum = 0.0;
			a = 0.0;

			for(i=0;i<n;i++){
				rec[i] = sc.nextDouble();
				sum += rec[i];
			}
			sum /= n;
			for(i=0;i<n;i++){
				a += Math.pow((rec[i]-sum), 2.0);
			}
			a /= n;
			a = Math.sqrt(a);

			System.out.printf("%.8f\n",a);
		}

		sc.close();


	}

}

