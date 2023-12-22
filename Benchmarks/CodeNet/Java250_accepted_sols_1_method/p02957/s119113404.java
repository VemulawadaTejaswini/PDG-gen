import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int tmp = (a + b) / 2;
        if(Math.abs(a - tmp) == Math.abs(b - tmp)) {
            System.out.println(tmp);
        } else if(Math.abs(a - tmp + 1) == Math.abs(b - tmp + 1)) {
            System.out.println(tmp - 1);
        } else if(Math.abs(a - tmp - 1) == Math.abs(b - tmp - 1)) {
            System.out.println(tmp + 1);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    } 
}