
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		String str=scn.next();
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)!=str.charAt(i-1)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
