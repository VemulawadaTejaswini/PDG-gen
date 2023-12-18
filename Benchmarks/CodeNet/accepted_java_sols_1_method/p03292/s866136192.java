import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int A3 = sc.nextInt();
        
        int max = Math.max(A1, Math.max(A2, A3) );
        int min = Math.min(A1, Math.min(A2, A3) );
        System.out.println(max - min);
    }
}
