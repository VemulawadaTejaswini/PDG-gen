import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        String N = sc.next(),ans = "...";
        if(N.length() <= a) System.out.println(N);
        else System.out.println(N.substring(0, a) + ans);
    }
}






