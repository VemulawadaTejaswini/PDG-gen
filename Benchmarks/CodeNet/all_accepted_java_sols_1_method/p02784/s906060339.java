import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        int A = 0;
        
        for(int i = 0; i < N; i++){
            A += sc.nextInt();
        }
        
        System.out.println(H > A ? "No" : "Yes");
    }
}