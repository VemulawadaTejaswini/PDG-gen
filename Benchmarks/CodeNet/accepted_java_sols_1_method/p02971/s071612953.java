import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N =scan.nextInt();
		int max=0,midx=0;
		int max2=0,midx2=0;

		for(int i=0; i<N ;i++)
		{
			int a =scan.nextInt();
			if(max<a){
				max=a;
				midx=i;
			}else if(max2<a) {
				max2=a;
				midx2=a;
			}
		}
		PrintWriter pw=new PrintWriter(System.out);
		for(int i=0;i<N;i++) {
			if(i==midx) {
				pw.println(max2);
			}else {
				pw.println(max);
			}
		}
		pw.flush();


	}
}