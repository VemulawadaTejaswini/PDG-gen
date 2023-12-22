import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int bob=0;
		int Alice=0;
		int b[]=new int[a];
		for(int i=0;i!=a;i++) {
			b[i]=scan.nextInt();
		}
		Arrays.sort(b);
		for(int i=0;i!=a;i++) {
			if(i%2==0) {
				bob+=b[i];
			}
			else {
				Alice+=b[i];
			}
		}
		System.out.println(Math.abs(Alice-bob));
	}
}