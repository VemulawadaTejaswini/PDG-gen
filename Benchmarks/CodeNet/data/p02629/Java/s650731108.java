import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		Scanner in = new java.util.Scanner(System.in);
		//long max = 1000000000000001L;
		           //205891132094649
		long a = 26L*26*26*26*26*26*26*26*26*26;
		long X = in.nextLong();
		String[] c = {"a", "b", "c", "d", "e", "f", "g",
				"h", "i", "j", "k", "l","n", "m",
			    "o", "p", "q", "r", "s", "t", "u",
			    "v", "w", "x", "y", "z"
		};
		
		String s = "";
		for(int i=0; i<11; i++) {
			//System.out.println(X + " / " + a);
			Long t = X/a;
			if(t>=1) {
				s += c[t.intValue()-1];
			}

			X -= a * t;
			a = a/26;
			
		}
		
		System.out.println(s);
		
		in.close();
	}
}
