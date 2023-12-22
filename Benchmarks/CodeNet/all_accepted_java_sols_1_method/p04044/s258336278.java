import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); 
        int L = sc.nextInt();
        String[] s = new String[N];
        String[] S = new String[N];
      
        for(int i=0; i<N; i++){
          s[i] = sc.next();
          S[i] = s[i];
        }
      
        Arrays.sort(S);

        String X = S[0];
        for(int i=1; i<N; i++){
          X = X + S[i];
        }
        System.out.println(X);
    }
}