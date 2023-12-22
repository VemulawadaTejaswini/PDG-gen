import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int P[] = new int[N];
        for(int i = 0; i < N; ++i){
            P[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < N-2; ++i){
            if(P[i] < P[i+1] && P[i+1] < P[i+2] || P[i] > P[i+1] && P[i+1] > P[i+2]){
             count += 1;   
            }
        }
        System.out.println(count);
	}
}