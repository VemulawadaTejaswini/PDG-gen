import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			double s = (double)(a * b) / 3.305785;
			System.out.printf("%.5f\n",s);
		}
	}
}