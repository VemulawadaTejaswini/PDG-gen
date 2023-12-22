import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ai = new int[N];
		for(int i =0; i < N; i++){
			ai[i]=0;
		}
		for(int i =0; i < N-1; i++){
			int up = sc.nextInt();
			ai[up-1]++;
		}
		for(int i =0; i < N; i++){
			System.out.println(ai[i]);
		}
        return;
	}
}
