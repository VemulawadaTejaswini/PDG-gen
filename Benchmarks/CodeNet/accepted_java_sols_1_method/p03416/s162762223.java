import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int ans=0;
	for(int i=a;i<=b;i++) {
		int x=i;
		int c=x%10;
		x/=10;
		int d=x%10;
		x/=10;
		x/=10;
		int f=x%10;
		x/=10;
		int g=x%10;
		if(c==g&&d==f) {
			ans++;
		}
	}
	System.out.println(ans);
	scan.close();
}
}