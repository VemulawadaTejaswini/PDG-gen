import java.util.Scanner;

public class Main {
public static void main(String[]args) {
	Scanner tc = new Scanner (System.in);
	int k, cont=0, cont2=0;
	String S;
	S = tc.next();
	k = S.length();
	if(k>=1&& k<=15) {
	for (int i = 0; i<k; i++) {
		if (S.charAt(i) == 'x') {
			cont++;              
			} 
		if(S.charAt(i)== 'o') {
			cont2++;
		}
	}
	
	if(cont>=1&&cont<=7||cont2>=8) {
		System.out.println("YES");
	}else {
		System.out.println("NO");
	}
	}
}
}
