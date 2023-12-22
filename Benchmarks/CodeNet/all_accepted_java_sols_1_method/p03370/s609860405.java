import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int min=1145148101;
	for(int i=0;i!=a;i++) {
		int d=scan.nextInt();
		b-=d;
		if(min>d) {
			min=d;
		}
	}
	System.out.println(a+(b/min));
}
}