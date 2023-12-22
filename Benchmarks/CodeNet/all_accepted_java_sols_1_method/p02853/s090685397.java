import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int X=sc.nextInt();
	int Y=sc.nextInt();
	int ans=0;
	if(X<4) {
		switch (X) {
		case 1:
			ans+=300000;
			break;
		case 2:
			ans+=200000;
			break;
		case 3:
			ans+=100000;
			break;
		}

	}
	if(Y<4) {
		switch (Y) {
		case 1:
			ans+=300000;
			break;
		case 2:
			ans+=200000;
			break;
		case 3:
			ans+=100000;
			break;
		}
	}
	if(X==1&&Y==1) {
		ans+=400000;
	}
	System.out.println(ans);
}
}