import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int H1 = sc.nextInt();
        int M1 = sc.nextInt();
        int H2 = sc.nextInt();
        int M2 = sc.nextInt();
        int K = sc.nextInt();
        int h = H2 - H1;
        int M = M2 - M1;
        int m=0;
        if(M<0){
            h--;
            m = 60 + M;
        }
        else
        {
            m = M;
        }
        int result = 60 * h + m;
        System.out.println(result- K);
    }
}
