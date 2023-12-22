import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int ans=0;
	if(a%2==0) {
	if(a/2<b||a<b) {
		ans=1;
	}
	}
	else {
		if((a+1)/2<b||a<b) {
			ans=1;
		}
	}
	System.out.println(ans==1?"NO":"YES");
}
}