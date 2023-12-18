import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] t = new int[N];
		int time = 0;
		int count = 0;
		int ans = 0;

		for(int i=0; i<N; i++){
			t[i] = sc.nextInt();
		}

		for(int i=1; i<N; i++){
			if(t[i]-t[i-1]>=T){
				time += T;
			}else{
				time += t[i]-t[i-1];
			}
		}
		time += T;
		System.out.println(time);
	}
}
