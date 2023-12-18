
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		String[] lines = line.split(" ");

		int N = Integer.parseInt(lines[0]);
		int M = Integer.parseInt(lines[1]);
		long K = Long.parseLong(lines[2]);
		ArrayList<Long> A = new ArrayList<>();
		ArrayList<Long> B = new ArrayList<>();
//		long[] A = new long[N];
//		long[] B = new long[M];

		line = sc.nextLine();
		lines = line.split(" ");
		for(int i = 0; i < N; i++) {
			A.add(Long.parseLong(lines[i]));
//			A[i] = Long.parseLong(lines[i]);
//			System.out.println(A[i]);
		}

		line = sc.nextLine();
		lines = line.split(" ");
		for(int i = 0; i < M; i++) {
			B.add(Long.parseLong(lines[i]));
//			B[i] = Long.parseLong(lines[i]);
//			System.out.println(B[i]);
		}

		long count = 0;
		int a = 0;
		int b = 0;
		while(K >= 0) {
			count++;
			if(A.size() > 0 &&  B.size() > 0) {
				if(A.get(0) <= B.get(0)) {
					K = K - A.get(0);
					A.remove(0);
				}else{
					K = K - B.get(0);
					B.remove(0);
				}
			}
			else if(A.size() > 0 &&  B.size() <= 0) {
				K = K - A.get(0);
				A.remove(0);
			}
			else if(A.size() <= 0 &&  B.size() > 0) {
				K = K - B.get(0);
				B.remove(0);
			}else if(A.size() <= 0 &&  B.size() <= 0){
				break;
			}

		}

		System.out.println(count-1);
	}
}
