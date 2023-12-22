import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int D = scan.nextInt();
        int count = 0;
        for(int i = 0; i < N; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            double d = (Math.pow(x, 2) + Math.pow(y, 2));
            if(Math.pow(D, 2) >= d) count++;
        }
        System.out.println(count);
    }
}
