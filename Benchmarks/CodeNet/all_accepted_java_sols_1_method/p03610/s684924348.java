import java.util.*;


class Main {
    private static Scanner sc;


    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        String ans = sc.next();
        for (int i = 0; i < ans.length(); i+=2) {
            System.out.print(ans.substring(i, i + 1));
        }
    }
}



