import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              int D = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();
        String res = D <= T * S ? "Yes" : "No";
        System.out.println(res);
    }
}