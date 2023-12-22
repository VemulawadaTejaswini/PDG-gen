import java.util.Scanner;

public class Main {
	static int intN =0;
	static int sosuCnt =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		//String[] h = sc.nextLine().split(" ");

		int intN = Integer.parseInt(n);

		double sum=0;
		
		if (intN==1) {
			sum=1.0000000000;
		} else if(intN%2==0) {
			sum=0.5000000000;
		} else {
			sum=1-(double)(intN/2)/intN;
		}

		System.out.println(sum);


		//int a = Integer.parseInt("");
		//for (int i = 0;i < intN;i++) {
		//sum=sum+i;
	//}

	}
}
