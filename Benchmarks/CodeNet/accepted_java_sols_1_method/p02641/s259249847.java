import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int X = sc.nextInt();
		final int N = sc.nextInt();
		if(N==0){
			sc.close();
			System.out.println(X);
			return;
		}
		ArrayList<Integer> p = new ArrayList<>();
		int max=0;
		for(int i=0;i<N;++i){
			p.add(sc.nextInt());
		}
		for(int i=0;i<N;++i){
			max = Math.max(p.get(i), max);
		}
		sc.close();
		int ans = 0;
		int i=0;
		int min = 101;
		int tmp = min;
		while(i<(X+max)){
			if(p.contains(i)) {
				++i;
				continue;
			}
			min = Math.min(Math.abs(X-i), min);
			if(Math.min(tmp, min)==tmp){break;}
			ans = i;
			++i;
			tmp = min;
		}
		System.out.println(ans);
	}
}
