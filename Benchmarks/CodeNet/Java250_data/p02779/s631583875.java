import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < N; i++) set.add(sc.nextInt());
		System.out.println(N == set.size() ? "YES" : "NO");
	}
}