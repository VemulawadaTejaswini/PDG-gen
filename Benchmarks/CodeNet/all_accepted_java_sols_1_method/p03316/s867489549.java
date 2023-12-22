import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int c=a;
	int b=0;
	for(int i=0;i<=10;i++) {
		b+=a%10;
		a/=10;
	}
	System.out.println(c%b==0?"Yes":"No");
}
}