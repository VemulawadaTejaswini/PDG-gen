import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int count = S.length()/2;
		for (int i=1;i<S.length()/2;i++) {
			String front = S.substring(0,count-i);
			String back = S.substring(count-i,(count-i)*2);
			if (front.equals(back)==true) {
				System.out.println(front.length()*2);
				return ;
			}
		}
	}

}