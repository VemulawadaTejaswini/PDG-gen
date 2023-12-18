import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println((a+1)/2<b?"NO":"YES");
	scan.close();
}
}