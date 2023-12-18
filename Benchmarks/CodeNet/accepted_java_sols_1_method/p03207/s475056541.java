import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int ans=0;
	int max=0;
	for(int i=0;i<a;i++) {
		int b=scan.nextInt();
		ans+=b;
		if(max<b) {
			max=b;
		}
	}
	System.out.println(ans-max/2);
	scan.close();
	}
}
