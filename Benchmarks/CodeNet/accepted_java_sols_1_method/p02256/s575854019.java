import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int a = Integer.parseInt(std.next());
		int b = Integer.parseInt(std.next());
		int temp;
		if(a<b){temp=b; b=a; a=temp;}

		int m = a%b;
		while(m!=0){
			temp = a;
			a = b;
			b = temp%b;
			m = a%b;
		}
		System.out.println(b);
	}
}