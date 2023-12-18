import java.util.*;


public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N];
		List<Integer> list = new ArrayList<>();
		//リストにAの要素を入れて昇順に並び替える
		for(int i=0; i<N; i++) {
			A[i]= sc.nextInt();
			list.add(A[i]);
		}
		Collections.sort(list);
		
		//要素最大値のときは2番目の最大値を表示し、
		//それ以外は最大値を表示させればよい
		for(int i=0; i<N; i++) {
			if(A[i]==list.get(N-1)) {
				System.out.println(list.get(N-2));
			}else {
				System.out.println(list.get(N-1));
			}
		}
	}
}