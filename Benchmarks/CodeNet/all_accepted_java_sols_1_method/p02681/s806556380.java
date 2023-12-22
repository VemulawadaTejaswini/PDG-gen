import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
	String S = s.next(); 
	char[] Schrs = new char[S.length()];
	String T = s.next();
	char[] Tchrs = new char[T.length()];
	String ans = "Yes";
	
	for(int i=0; i<S.length(); i++) {
		Schrs[i]= S.charAt(i);
		Tchrs[i]= T.charAt(i);
		if(Schrs[i]!=Tchrs[i]) {ans ="No"; break;}
		
	}
		System.out.println(ans);
		
	}

}
