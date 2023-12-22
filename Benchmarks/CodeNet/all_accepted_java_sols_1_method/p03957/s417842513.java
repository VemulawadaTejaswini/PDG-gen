import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int flag1 = 0, flag2 = 0;

		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='C') flag1 = 1;
			if(s.charAt(i)=='F' && flag1==1) flag2 = 1;
		}

		System.out.println((flag2==0)?"No":"Yes");
	}
}