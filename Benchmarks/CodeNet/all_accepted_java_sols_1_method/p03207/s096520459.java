import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]p  = new int [N];
 
    int all = 0;
    for(int i=0; i<N; i++){
    p[i] = sc.nextInt();
        all += p[i];
    }
    Arrays.sort(p); 
    int hangaku = p[N-1]/2;

    System.out.println(all-hangaku);
    }
}
