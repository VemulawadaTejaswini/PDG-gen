import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a,b,i,c=0;
		while (stdIn.hasNext()) {
			a = stdIn.nextInt();
			b = stdIn.nextInt();
			c=a+b;
			for(i=0;0<c;i++){
				c=c/10;
			}
			System.out.println(i);
	}
	}
}