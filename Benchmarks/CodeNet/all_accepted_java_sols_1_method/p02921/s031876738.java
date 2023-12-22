import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String S = input.next();
		String T = input.next();
		int a=0;
		
		for(int i=0;i<3;i++) {
			char x =S.charAt(i);
			char y =T.charAt(i);
			if (x==y) {
				a+=1;
			}
		}
		System.out.print(a);

	}

}
