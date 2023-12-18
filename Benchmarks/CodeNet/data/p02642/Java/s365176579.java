import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		for(int i=0;i<N;++i){
			A.add(sc.nextInt());
		}
		int counter = 0;
		for(int i=0;i<N;++i){
			int j = 0;
			for(;j<N;++j){
				if (i == j)
					continue;
				if(A.get(i) % A.get(j) == 0) break;
			}
			if(j == N) ++counter;
		}
		System.out.println(counter);
	}
}
