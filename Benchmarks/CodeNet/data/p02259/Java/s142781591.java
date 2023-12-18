import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, temp, cnt = 0;
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			A.add(sc.nextInt());
		}
		
		for(int i = 0; i < n - 1; i++){
			for(int j = n - 1; j > i; j--){
				if(A.get(j - 1) > A.get(j)){
					temp = A.get(j - 1);
					A.set(j - 1, A.get(j));
					A.set(j, temp);
					cnt ++;
				}
			}
		}
		
		for(int i = 0; i < n - 1; i++){
			System.out.print(A.get(i) + " ");
		}
		System.out.println(A.get(n-1));
		System.out.println(cnt);
	}
}