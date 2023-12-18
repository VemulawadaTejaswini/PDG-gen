import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int puls = A + B;
        int minus = A - B;
        int times = A * B;
        int max1 = Math.max(puls, minus);
        int max2 = Math.max(max1, times);
        System.out.println(max2);
    }
}