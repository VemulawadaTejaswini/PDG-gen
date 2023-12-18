import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,cnt=0;
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();

		for(int i=a;i<=b;i++) {
			if(c%i==0)cnt++;
		}
		System.out.println(cnt);
		scan.close();
	}

}
