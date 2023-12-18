import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] a = new int[m];
		int[] b = new int[m];

		for (int i=0; i<m; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		int[] ans = new int[n-1];

		HashSet<Integer>hs1 = new HashSet<>();
		HashSet<Integer>hs2 = new HashSet<>();
		HashSet<Integer>hs3 = new HashSet<>();
		hs1.add(1);
		hs3.add(1);

		while (true) {

			for(int i = 0; i<m; i++) {
				if (hs1.contains(a[i]) && !hs3.contains(b[i])){
					ans[b[i]-2] = a[i];
					hs2.add(b[i]);
					hs3.add(a[i]);
				} else if (hs1.contains(b[i]) && !hs3.contains(a[i])){
					ans[a[i]-2] = b[i];
					hs2.add(a[i]);
					hs3.add(b[i]);
				}
			}

			boolean result =true;
			for (int i=0; i<n-1; i++){
				if (ans[i] == 0){
					result = false;
					break;
				}
			}
			if (result){
				break;
			}
			if (hs2.size() == 0){
				System.out.println("No");
				return;
			}
			hs1 = (HashSet<Integer>) hs2.clone();
		}
		System.out.println("Yes");
		for (int i=0; i<n-1; i++){
			System.out.println(ans[i]);
		}
	}


}