import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long X = scan.nextLong();
        long K = scan.nextLong();
        long D = scan.nextLong();
        for(int i = 0; i < K; i++){
            if(Math.abs(X+D) < Math.abs(X-D)) X += D;
            else X -= D;
        }
        System.out.println(X);
        
    }
}
