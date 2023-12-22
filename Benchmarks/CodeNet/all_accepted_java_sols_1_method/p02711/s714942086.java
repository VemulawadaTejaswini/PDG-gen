import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		boolean seven = false;
		for(int i = 0; i < N.length(); i++)
			if(N.charAt(i)=='7')
				seven = true;
		System.out.println(seven ? "Yes" : "No");
	}

}
