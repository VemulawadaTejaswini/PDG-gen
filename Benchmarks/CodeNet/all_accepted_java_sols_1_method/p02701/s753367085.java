import java.util.Arrays;
import java.util.Scanner;
 
class Main {
	public static void main(final String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();
		 String S[] = new String[N];
		 int ans = 1;

        for(int i=0;i<N;i++) {
        	S[i] = sc.next();
        }
        
		Arrays.sort(S);
		
		for(int i = 1; i < N; i++){
			if(! S[i-1].equals(S[i])){
				ans ++;
			}
		}

        System.out.print(ans);
        

	}
}
