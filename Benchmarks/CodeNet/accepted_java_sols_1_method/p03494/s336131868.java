import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b[]=new int[a];
	for(int i=0;i!=a;i++) {
		b[i]=scan.nextInt();
	}
	int ans=0;
	loop:for(;;) {
	for(int i=0;i!=a;i++) {
		if(i==a-1) {
			ans++;
		}
		if(b[i]%2==1) {
			System.out.println(ans);
			break loop;
		}
		else {
			b[i]/=2;
		}
	}
	}
}
}