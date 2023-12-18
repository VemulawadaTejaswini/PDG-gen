import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		long  power=1;
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			power=(power*i)%(1000000007);
		}
		System.out.println(power);

	}

}