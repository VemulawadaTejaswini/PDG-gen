import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int a=t.nextInt(), b=t.nextInt(), c=t.nextInt();
		while(a != b && c !=0) {
			b = b +1;
			c = c-1;
			}
		System.out.println(c);
		
	}
	}