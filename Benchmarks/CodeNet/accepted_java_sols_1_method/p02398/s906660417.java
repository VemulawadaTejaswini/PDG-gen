import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int i = 0;
        for (int e = a; e <= b; e++) {
            if (c % e == 0)
                i++;
        }
        System.out.println(i);
    }
}