import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = a + (int) Math.pow(a, 2) + (int) Math.pow(a, 3);
        System.out.println(result);
    }
}