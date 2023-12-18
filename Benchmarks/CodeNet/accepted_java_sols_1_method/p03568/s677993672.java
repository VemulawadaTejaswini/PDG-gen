import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int all = 1;
        int odd = 1;
        for (int i = 0; i < N; i++) {
             int A =  sc.nextInt();
             all *= 3;
             if (A%2 == 0) {
                 odd *= 2;
             } else {
                 odd *= 1;
             }
        }
        System.out.println(all-odd);
    }
}
