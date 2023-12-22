
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.next(),b=sc.next();
		boolean flag = true;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=b.charAt(i)) {
				flag = false;
			}
		}
		if(a.length()+1!=b.length()) {
			flag = false;
		}
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}