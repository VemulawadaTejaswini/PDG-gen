import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long D = sc.nextInt();
        int count = 0;
        for(int i = 0; i < N; i++){
            long X = sc.nextInt();
            long Y = sc.nextInt();
            if(X*X+Y*Y > D*D){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
