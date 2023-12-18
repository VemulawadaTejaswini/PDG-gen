//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int [N-1];
		for(int i=0;i<N-1;i++) {
			A[i] = sc.nextInt();
		}
		Map<Integer,Integer> map = new TreeMap<>();
		for(int i=1;i<=N;i++) {
			map.put(i,0);
		}
		for(int j=0;j<N-1;j++) {
			map.put(A[j],map.get(A[j])+1);
		}
		for(Integer value:map.values()) {
			System.out.println(value);
		}
	}
}