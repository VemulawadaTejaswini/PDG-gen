import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        
        if(K % 2 == 0) {
            System.out.println(-1);
            System.exit(0);
        }
        
        int seven = 7;
        for(int i = 1; true; ++i) {
            seven %= K;
            if(seven == 0) {
                System.out.println(i);
                break;
            } else {
                seven = seven * 10 + 7;
            }
        }
    }
}
