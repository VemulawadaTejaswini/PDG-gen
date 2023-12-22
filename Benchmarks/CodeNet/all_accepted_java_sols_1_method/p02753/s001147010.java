import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String S=input.next();
		//System.out.println(S);
		//if(S=="AAA") ←　数値のみ有効 
		if("AAA".equals(S)||"BBB".equals(S)) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
	}

}
