import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int D = s.nextInt();
        int T = s.nextInt();
        int S = s.nextInt();
        if(D/S > T) System.out.println("No");
        else if(D/S == T && D%S != 0) System.out.println("No");
        else System.out.println("Yes");
    }
}