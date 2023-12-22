import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> value  = new ArrayList<>();
		ArrayList<Integer> cost = new ArrayList<>();
		ArrayList<Integer> array = new ArrayList<>();
		int ans = 0;
		for(int i=0;i<N;i++)
			value.add(sc.nextInt());
		for(int i=0;i<N;i++)
			cost.add(sc.nextInt());
		for(int i=0;i<N;i++) {
			array.add(value.get(i) - cost.get(i));
		}
		for(int i=0;i<N;i++) {
			int t = array.get(i);
			if(t > 0)
				ans += t;
		}
		System.out.println(ans);
		sc.close();
	}
}
