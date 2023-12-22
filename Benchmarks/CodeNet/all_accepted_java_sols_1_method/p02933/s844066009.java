import java.util.*;

public class Main {
	static int N=26;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		String S=sc.next();
		if(N>=3200) {
			System.out.println(S);
		}else {
			System.out.println("red");
		}

	

}
}