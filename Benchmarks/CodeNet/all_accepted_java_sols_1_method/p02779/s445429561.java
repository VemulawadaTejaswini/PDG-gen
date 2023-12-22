import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int N = sc.nextInt();
		HashMap<Integer,Integer> hash = new HashMap<Integer, Integer>();
		int A[] = new int[N];
		for(int i=0; i<N; i++){
			A[i] = sc.nextInt();
			if(hash.get(A[i]) == null){
				hash.put(A[i],A[i]);
			} else {
				flag = false;
				break;
			}
		}


		if(flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}


