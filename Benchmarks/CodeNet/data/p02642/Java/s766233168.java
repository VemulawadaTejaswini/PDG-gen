import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		int min = 1000000;
		for(int i=0;i<N;++i){
			A.add(sc.nextInt());
			min = Math.min(min, A.get(i));
		}
		sc.close();
		int counter = 0;
		for(int i=0;i<N;++i){
			if(A.get(i) != min && A.get(i)%min == 0) continue;
			int j = 0;
			for(;j<N;++j){
				if (i == j)
					continue;
				if(A.get(i) % A.get(j) == 0)
					break;
			}
			if(j == N) ++counter;
		}
		System.out.println(counter);
	}
}
