import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        while (G <= R) {
            G *= 2;
            count++;
        }
        while (B <= G) {
            B *= 2;
            count++;
        }
        System.out.println(K <= count ? "No" : "Yes");
    }
}