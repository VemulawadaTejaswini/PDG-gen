import java.util.*;
public class Main{
	public static void main(String[] argus){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int recoverSum = 0;
		int[] del = new int[N+1];
		int ans = 0;
		
		for(int i=0; i<N; i++){
			del[i] = sc.nextInt();
		}
		
		for(int j=0; j<N; j++){
			for(int h=j+1; h<N; h++){
				ans = del[j] * del[h];
				recoverSum += ans;
				ans = 0;
			}
		}
		
		System.out.println(recoverSum);
	}
}
