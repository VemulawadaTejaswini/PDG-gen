import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        
        int h = S / (60 * 60);
        int m = (S - 60 * 60 * h) / 60;
        int s = S % 60;
        
        System.out.printf("%d:%d:%d\n", h, m, s);
    }
}
