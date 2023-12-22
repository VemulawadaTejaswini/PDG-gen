import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> H = new ArrayList<>();
		for(int i=0;i<N;++i){
			H.add(sc.nextInt());
		}
		sc.close();
		int c = 0;
		int s;
		int e;
		int min = 101;
		for (int i = 0; i < N; ++i)
			min = Math.min(H.get(i), min);
		for (int i = 0; i < N; ++i)
			H.set(i, H.get(i)-min);
		c += min;
		while(Collections.frequency(H, 0) != H.size()){
			for (s = 0; H.get(s) == 0; ++s)
				continue;
			for (e = s + 1; H.size() > e && H.get(e) != 0; ++e)
				continue;
			for (int i = s; i < e; ++i) {
				H.set(i, H.get(i)-1);
			}
			++c;
		}
		System.out.println(c);
	}
}
