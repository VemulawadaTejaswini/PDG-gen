import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<String> w =new ArrayList<String>();
		for(int i=0;i<N;i++) {
			w.add(in.next());
		}
		boolean flag= true;
		
		for(int i=0;i<N-1;i++) {
			char wend=w.get(i).charAt(w.get(i).length()-1);
			char wbstart=w.get(i+1).charAt(0)	;
			if(wend!=wbstart) {
				flag=false;
			}
		}

		Set<String> w2 =new HashSet<String>();
		for(int i=0;i<N;i++) {
			w2.add(w.get(i));
		}
		if(w2.size()!=N) {
			flag=false;
		}
		
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
