import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.printf("%d %d %.5f\n",(int)a/b,a%b,a/(double)b);
		scan.close();
	}
}