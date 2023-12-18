import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int H1 = scan.nextInt();
		int M1 = scan.nextInt();
		int H2 = scan.nextInt();
		int M2 = scan.nextInt();
		int K = scan.nextInt();

		int diff1 = H2-H1;
		int diff2 = M2-M1;
		if(diff2<=0){
			diff1=diff1-1;
			diff2=60+diff2;
		}
		int diffsum = diff1*60+diff2;
		int result = diffsum/K;
		if(diffsum%K==0) {
			result = result-1;
		}
		result = result*K;
		System.out.println(result);
	}
}