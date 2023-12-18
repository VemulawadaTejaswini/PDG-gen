
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		String result = "NG";

		scan.close();
		do{
		if(A%K==0) {
			result="OK";
		}
			A++;
		}while(result.equals("NG")&&A<=B);
		System.out.println(result);
	}

}