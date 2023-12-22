import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int A = Integer.parseInt(in.next());
		int B = Integer.parseInt(in.next());
		int C = Integer.parseInt(in.next());
		int cnt = 0;
		int e = 0;
		if(A%2 == 0) e++;
		if(B%2 == 0) e++;
		if(C%2 == 0) e++;
		if(e == 1 || e == 2){
			if((A%2 == B%2)&&B%2 != C%2){
				A++;
				B++;
				cnt++;
			}
			if((B%2 == C%2)&&C%2 != A%2){
				B++;
				C++;
				cnt++;
			}
			if((C%2 == A%2)&&A%2 != B%2){
				C++;
				A++;
				cnt++;
			}
		}
		Integer[] arr = {A, B, C};
		Arrays.sort(arr, Collections.reverseOrder());
		while(arr[0] != arr[1]){
				arr[1] += 2;
				cnt++;
			}
		while(arr[1] != arr[2]){
			arr[2] += 2;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}