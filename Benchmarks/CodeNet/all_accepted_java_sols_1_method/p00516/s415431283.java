import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int k[] = new int[N];
		int s[] = new int[M];
		int v[] = new int[N];
		for(int j = 0; j < N; j++){
			k[j] = sc.nextInt();
		  }
		for(int j = 0; j < M; j++){
			s[j] = sc.nextInt();
		  }
		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				if(k[j] <= s[i]){
					v[j]++;
					break;
					}
				}
			}
		int  max = 0;
		for(int i = 0; i < N; i++){
			if(v[max] < v[i]){
				max = i;
				}
			}
		System.out.println(max + 1);
		}
	}