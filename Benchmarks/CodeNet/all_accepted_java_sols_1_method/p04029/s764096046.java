import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
           
            int N = sc.nextInt();
            int num = 0;
            
            for (int i=1; i<=N; i++) {
                num += i;
            }
        System.out.println(num);
    }
}