import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String next = sc.next();
 
        a = s1[0].equals(next) ? a - 1 : a;
        b = s1[1].equals(next) ? b - 1 : b;
        System.out.println(a + " " + b);
    }
}