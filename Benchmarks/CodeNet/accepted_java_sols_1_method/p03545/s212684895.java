import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		//String N = in.nextLine();
		int N = in.nextInt();
		int D = N%10;
		N = N/10;
		int C = N%10;
		N = N/10;
		int B = N%10;
		N = N/10;
		int A = N;
		if(A+B+C+D==7) {
			System.out.println(A+"+"+B+"+"+C+"+"+D+"=7");
		}else if(A+B+C-D == 7) {
			System.out.println(A+"+"+B+"+"+C+"-"+D+"=7");
		}else if(A+B-C+D == 7) {
			System.out.println(A+"+"+B+"-"+C+"+"+D+"=7");
		}else if(A+B-C-D == 7) {
			System.out.println(A+"+"+B+"-"+C+"-"+D+"=7");
		}else if(A-B+C+D == 7) {
			System.out.println(A+"-"+B+"+"+C+"+"+D+"=7");
		}else if(A-B+C-D == 7) {
			System.out.println(A+"-"+B+"+"+C+"-"+D+"=7");
		}else if(A-B-C+D == 7) {
			System.out.println(A+"-"+B+"-"+C+"+"+D+"=7");
		}else if(A-B-C-D == 7) {
			System.out.println(A+"-"+B+"-"+C+"-"+D+"=7");
		}
		in.close();
	}
}
