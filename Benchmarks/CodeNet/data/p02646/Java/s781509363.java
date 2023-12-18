import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();
        sc.close();

        if(W*T-V*T + (B-A) < 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
