import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[]L = new int[N];

    int all = 0;
    for(int i=0; i<N; i++){
        L[i] = sc.nextInt();
    }
        Arrays.sort(L); 
    int a = N-K;
    for(int i=a; i<N; i++){
        all += L[i];    
}
	System.out.println(all);
      }
}