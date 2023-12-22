
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		int flag=0;
		for(int i=1;i<str.length();i++) {
				if(str.charAt(i)==str.charAt(i-1)) {
					flag=1;
					System.out.println("Bad");
					break;
				}
		}
		if(flag==0) {
			System.out.println("Good");
		}
	}

}
