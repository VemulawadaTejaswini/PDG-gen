import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        String[] SH = S.split("");
        SH[K-1] =  SH[K-1].toLowerCase();
        String X = String.join("",SH);
        System.out.println(X);
    }
}