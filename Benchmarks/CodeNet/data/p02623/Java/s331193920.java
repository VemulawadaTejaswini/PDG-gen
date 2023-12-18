import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<>();
		ArrayList<Integer> B = new ArrayList<>();
		for(int i=0;i<N;++i){
			A.add(sc.nextInt());
		}
		for(int i=0;i<M;++i){
			B.add(sc.nextInt());
		}
		sc.close();
		int ans = 0;
		int next = Math.min(A.get(0), B.get(0));
		while(K-next>0){
			if(!A.isEmpty() && !B.isEmpty()){
				next = Math.min(A.get(0), B.get(0));
				if(next==A.get(0)) A.remove(0);
				else B.remove(0);
			}else if(A.isEmpty()){
				next = B.get(0);
				B.remove(0);
			}else{
				next = A.get(0);
				A.remove(0);
			}
			K-=next;
			/*
			System.out.println(next);
			System.out.println("\t" + K);
			System.out.println(A+"\n"+B);
			*/
			ans++;
			if(A.isEmpty() && B.isEmpty()){
				break;
			}
		}
		System.out.println(ans);
	}
}
