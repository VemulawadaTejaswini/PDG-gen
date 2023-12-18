import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    
    public static long factorial(int n) {
        if (n > 1) return factorial(n-1)*n;
        return 1;
    }
}