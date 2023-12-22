import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt() , k = sc.nextInt();
        String s = "a";
        int result = 0;
        
        int minA =  Math.min(a, k);
        result += minA;
        
        k -= minA;
        if (k < 0) {
            System.out.println(result);
            return;
        }
        
        k -= b;
        if (k < 0) {
            System.out.println(result);
            return;
        }

        int minC =  Math.min(c, k);
        result -= minC;

        System.out.println(result);
    }
}