import java.util.Scanner;
public class Main {
	public static void main(String[] s) {
		Scanner sc=new Scanner(System.in);
		int n;
		while(sc.hasNext()){
			n=sc.nextInt();
			System.out.println((n*n+n+2)/2);
		}
	}
}