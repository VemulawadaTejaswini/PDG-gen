import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int n,a;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		boolean exist=false;
		for(int i=0;i<2;i++) {
			int tmp=n%10;
			if(tmp==9)exist=true;
			n/=10;
		}
		if(exist)System.out.println("Yes");
		else System.out.println("No");
}
}
