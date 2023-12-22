import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String S = scan.next();

		String[] str = S.split("");
		int N = str.length;

		String S_two = S.substring(0, (N-1)/2  );
		String S_three = S.substring((N+3)/2 -1, N );

		StringBuffer b_str = new StringBuffer(S);
		StringBuffer b_str_two = new StringBuffer(S_two);
		StringBuffer b_str_three = new StringBuffer(S_three);

        String ReS = b_str.reverse().toString();
        String ReS_two = b_str_two.reverse().toString();
        String ReS_three = b_str_three.reverse().toString();


		boolean one = false;
		boolean two = false;
		boolean three = false;

		if (S.equals(ReS)){
			one = true;
		}
		if (S_two.equals(ReS_two)){
			two = true;
		}
		if (S_three.equals(ReS_three)){
			three = true;
		}


		if (one && two && three){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}

	}
}