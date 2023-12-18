import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String result = "No";
		int N100 = N/100;
		int N10 = (N-N100*100)/10;
		int N1 = (N-N100*100-N10*10);
		if(N100==7 || N10==7 || N1==7) {
			result="Yes";
		}
		scan.close();
		System.out.println(result);
	}
}