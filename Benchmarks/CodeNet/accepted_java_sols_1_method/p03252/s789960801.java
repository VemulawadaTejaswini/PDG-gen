import java.util.Scanner;
import java.util.TreeMap;
public class Main {
//One to One Correspondence
//Every single char in S has to correspond with every single char in T
//Every single char in T has to correspond with every single char in S
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		int N = S.length();
		TreeMap<Character, Character> StoT = new TreeMap<>();
		TreeMap<Character, Character> TtoS = new TreeMap<>();
		for (int i=0; i<N; i++){
			if (StoT.containsKey(S.charAt(i)) && (StoT.get(S.charAt(i)) != T.charAt(i))){
				System.out.println("No");
				System.exit(0);
			}
			if (TtoS.containsKey(T.charAt(i)) && (TtoS.get(T.charAt(i)) != S.charAt(i))){
				System.out.println("No");
				System.exit(0);
			}
			StoT.put(S.charAt(i), T.charAt(i));
			TtoS.put(T.charAt(i), S.charAt(i));
		}
		System.out.println("Yes");
		
	}

}