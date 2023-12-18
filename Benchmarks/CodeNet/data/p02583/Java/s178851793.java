import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> L = new ArrayList<>();
		for(int i=0;i<N;++i){
			L.add(sc.nextInt());
		}
		sc.close();

		int count=0;
		for(int i=0;i<N;++i){
			for(int j=0;j<N;++j){
				for(int k=0;k<N;++k){
					if(!(i<j && j<k)) continue;
					if(L.get(i) == L.get(j) ||
						L.get(i) == L.get(k) ||
						L.get(j) == L.get(k)){
							continue;
					}
					if(L.get(i) + L.get(j) > L.get(k) &&
						L.get(j) + L.get(k) > L.get(i) &&
						L.get(k) + L.get(i) > L.get(j)){
							//System.out.println("("+L.get(i)+","+L.get(j)+","+L.get(k)+")");
							count++;
					}
				}
			}
		}
		System.out.println(count);

	}
}

