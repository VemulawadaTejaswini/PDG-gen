import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		int length = str.length();
		sc.close();
		char[] temp = str.toCharArray();
		for(int i=0;i<length;i++) {
			if(temp[i]=='?') System.out.print('D');
			else System.out.print(temp[i]);
		}
	}
}