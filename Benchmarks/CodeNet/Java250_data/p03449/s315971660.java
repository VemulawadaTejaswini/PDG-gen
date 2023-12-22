import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a1 = new int[N];
		int[] a2 = new int[N];
		for(int i=0; i<N; i++){
			a1[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++){
			a2[i] = sc.nextInt();
		}
		
		int max = -1;
		for(int i=0; i<N; i++){
			int temp = 0;
			for(int j=0; j<N; j++){
				if(j<i) temp += a1[j];
				else if(j==i) temp += a1[j]+a2[j];
				else temp += a2[j];
			}
			max = Math.max(max, temp);
		}
		System.out.println(max);
		return;
	}
}