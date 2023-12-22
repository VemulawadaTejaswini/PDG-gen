
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String O = sc.next();
		String E = sc.next();
		sc.close();
		
		String o [] = O.split("");
		String e [] = E.split("");
		
		String ans = "";
		int min = Math.min(O.length(), E.length());
		
		for (int i=0; i<min; i++){
			ans+=o [i];
			ans+=e [i];
		}
		
		if (O.length()>E.length()){
			ans+=o[O.length()-1];
		}
		else if (O.length()<E.length()){
			ans+=e[E.length()-1];
		}
		
		System.out.println(ans);
	}

}
