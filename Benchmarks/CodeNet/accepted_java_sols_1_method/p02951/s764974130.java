import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int vessel1 = a - b;
        int vessel2 = c - vessel1;
        System.out.println(Math.max(vessel2,0));
    }
}