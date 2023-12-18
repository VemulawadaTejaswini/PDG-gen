import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt();
        if(a*4 >= b && a*2 <= b && b%2 == 0)System.out.println("Yes");
        else System.out.println("No");
    }
}






