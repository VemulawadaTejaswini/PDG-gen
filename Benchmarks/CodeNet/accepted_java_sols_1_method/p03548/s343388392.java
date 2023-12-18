import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int ISU=c;
	for(int i=0;;i++) {
	if(ISU>=a) {
		if((a-c)%(b+c)==0) {
		System.out.println(i);
		}
		else {
			System.out.println(i-1);
		}
		break;
	}
	ISU+=b+c;
	}
	scan.close();
}
}