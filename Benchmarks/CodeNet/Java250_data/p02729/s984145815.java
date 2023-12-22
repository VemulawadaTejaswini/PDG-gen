import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int n = 0;
        for(int i=1; i<=N-1; i++){
            n += i;
}
        int m = 0;
        for(int i=1; i<=M-1; i++){
            m += i;
}
                System.out.println(n+m);            
            }
}