import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a=scan.next();
		for(int i=0;i!=a.length();i++) {
			char b=a.charAt(i);
			if(b==',') {
				b=' ';
			}
			System.out.print(b);
		}
		System.out.println();
	}
	}