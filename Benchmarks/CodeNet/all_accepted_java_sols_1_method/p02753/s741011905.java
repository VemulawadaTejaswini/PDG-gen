import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String S = sc.next();

		S = S.replaceAll("AAA","-");
		S = S.replaceAll("BBB","-");
		S = S.replaceAll("-","");
		if(S.length()==0){
			System.out.println("No");			
		} else {
			System.out.println("Yes");

		}

	}
}

