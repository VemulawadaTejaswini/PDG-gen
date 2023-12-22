import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] P = new int[N];
		int min = Integer.MAX_VALUE;
		int count = 0;
      
		for(int i=0; i<N; i++){
			P[i] = sc.nextInt();
			if(min>=P[i]){
				min = P[i];
				count++;
            }
        }
		System.out.println(count);
    }
}