import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int total = 0;
		int count = 0;

		List<Integer> A =new ArrayList<>();
		List<Integer> B =new ArrayList<>();

		for(int i=0;i<N;i++) A.add(sc.nextInt());
		for(int i=0;i<M;i++) B.add(sc.nextInt());

		while(total<K){
			if(A.get(0)==null && B.get(0)==null) break;
			if(B.get(0)==null) {
				total += A.get(0);
				A.remove(0);
				if(total<K) count++;
				continue;
			}
			if(A.get(0)==null) {
				total += B.get(0);
				B.remove(0);
				if(total<K) count++;
				continue;
			}

			if(A.get(0)<=B.get(0)) {
				total += A.get(0);
				A.remove(0);
			}else {
				total += B.get(0);
				B.remove(0);
			}
			if(total<K) count++;
		}

		System.out.println(count);

	}

}