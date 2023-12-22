import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		char next = 'a';
		while(true) {
			if(next == 'a') {
				if(a.length()==0) {
					System.out.println("A");
					break;
				}
				next = a.charAt(0);
				a = a.substring(1);
			}else if(next == 'b') {
				if(b.length()==0) {
					System.out.println("B");
					break;
				}
				next = b.charAt(0);
				b = b.substring(1);
			}else {
				if(c.length()==0) {
					System.out.println("C");
					break;
				}
				next = c.charAt(0);
				c = c.substring(1);
			}
	//		System.out.println(next);
		}
	}

}