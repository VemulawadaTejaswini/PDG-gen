import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//------------------------------------------------------------
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n = Integer.parseInt(sc.next());
		Set<Integer> mochis =new HashSet<>();
		for (int i=0;i<n;i++) {
			mochis.add(sc.nextInt());
		}
		System.out.println(mochis.size());
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}



//----------------------------------------