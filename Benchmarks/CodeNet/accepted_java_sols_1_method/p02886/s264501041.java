import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]d = new int[N];

    int all = 0;    
    for(int i=0; i<N; i++){
        d[i] = sc.nextInt();
}
    for(int i=0; i<N-1; i++){
        for(int j=i+1; j<N; j++){
    all += d[i]*d[j];        
    }
}
	System.out.println(all);
      }
}
