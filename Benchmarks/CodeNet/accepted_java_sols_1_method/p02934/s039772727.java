import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();

		double sum=0;
		for(int i=0;i<n;i++) {
			sum+=1.0/(double)sc.nextInt();
		}


			System.out.println(1.0/sum);

	}

}
