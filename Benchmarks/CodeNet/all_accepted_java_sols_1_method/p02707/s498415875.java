
public class Main {

	public static void main(String[] args) {
		// System.out.print("社員の数を入力(2≤N≤2×10^5):");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int N = sc.nextInt();
		int[] count = new int[N];

		
		for(int i=1;i<N;i++){
			count[sc.nextInt()-1]++;
		}

		for(int i=0;i<N;i++){
			System.out.println(count[i]);
		}
	}

}
