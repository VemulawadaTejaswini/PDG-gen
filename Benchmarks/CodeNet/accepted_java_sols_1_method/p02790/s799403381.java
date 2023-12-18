import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String A = scan.next();
		String B = scan.next();
		char a = A.charAt(0);
		char b = B.charAt(0);
		int a_num = a-48;
		int b_num = b-48;
		
		if(a_num > b_num) {
			for(int i=0;i<a_num;i++) {
				if(i == a_num-1) {
					System.out.println(B);
				}else {
					System.out.print(B);
				}
			}
		}else {
			for(int i=0;i<b_num;i++) {
				if(i == b_num-1) {
					System.out.println(A);
				}else {
					System.out.print(A);
				}
			}
		}
		
		
		
	}

}
