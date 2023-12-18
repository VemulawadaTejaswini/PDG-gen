import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
        int N = S.length();
      
      
		System.out.println(""+S.charAt(0) + (N-2) + S.charAt(N-1));
    }
}
