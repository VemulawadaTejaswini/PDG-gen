import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int D = scan.nextInt();
        int T = scan.nextInt();
        int S = scan.nextInt();
        int result = 0;
        if(D%S == 0) result = D/S;
        else result = D/S +1;
        if(result <= T) System.out.println("Yes");
        else System.out.println("No");
    }
}
