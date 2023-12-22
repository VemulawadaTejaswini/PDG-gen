import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = "Yes";
		Set<String> set = new HashSet<>();
		String w = sc.next();
		set.add(w);
		char e = w.charAt(w.length()-1);

		for(int i=0; i<N-1; i++) {
			w = sc.next();
			if(set.add(w) && e==w.charAt(0)){
				e = w.charAt(w.length()-1);
		        set.add(w);
		     }else{
		        s = "No";
		      }
		}
		sc.close();
		System.out.println(s);
	}

}