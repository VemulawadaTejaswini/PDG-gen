import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> a = new ArrayList<>(); 
//		int[] a = new int[n];
		for(i=0;i<n;i++) {
			a.add(Integer.parseInt(sc.next()));
		}
		sc.close();
		Collections.sort(a, Comparator.reverseOrder());
		int ans = 0;
		for(i=0;i<n;i++) {
			if(i%2==0)ans+=a.get(i);
			     else ans-=a.get(i);
		}
		System.out.println(ans);
	}
}
