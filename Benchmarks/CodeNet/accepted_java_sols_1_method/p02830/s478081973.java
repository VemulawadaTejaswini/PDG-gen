import java.util.*;
public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next() , T = sc.next();
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			
			sb.append(S.charAt(i));
			sb.append(T.charAt(i));
			
		}
		System.out.println(sb.toString());
	}

	
}

