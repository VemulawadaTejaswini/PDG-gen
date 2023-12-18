import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        if((N+1)/2 >= K){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
