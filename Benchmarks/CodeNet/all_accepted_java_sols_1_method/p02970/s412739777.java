import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int D=sc.nextInt();
		
		int num=N-2*D-2;
		
		if(2*D+1>=N) {
			System.out.println(1);
		}else {
		int x=(int)Math.ceil(num/(2*D+1));
		System.out.println(x+2);
		}
		sc.close();
	}
}