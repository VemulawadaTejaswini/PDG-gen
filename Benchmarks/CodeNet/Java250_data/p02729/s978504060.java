import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    int gu = 0;
    for(int i=1; i<N; i++){
        gu += i;  
      }
    int ki = 0;
    for(int i=1; i<K; i++){
        ki += i;  
    }
 	System.out.println(gu+ki);
      }
}
