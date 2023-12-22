import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			Set<Integer> Aset = new HashSet<Integer>();
			
			for(int i=0;i<N;i++) {
				Aset.add(sc.nextInt());
			}
			
			int L = Aset.size();
			
			if(L==N) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}