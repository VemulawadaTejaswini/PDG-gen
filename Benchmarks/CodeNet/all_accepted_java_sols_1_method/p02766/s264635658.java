import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int num =(int) (Math.log(N) / Math.log(K));
        System.out.println(num + 1);
    }
}
