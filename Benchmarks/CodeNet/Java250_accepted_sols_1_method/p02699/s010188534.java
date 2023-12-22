import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        int K = sc.nextInt(),A = sc.nextInt();
        if(K <= A)System.out.println("unsafe");
        else System.out.println("safe");
    }
}






