import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final char C[] = sc.next().toCharArray();
        sc.close();

        System.out.println(++C[0]);
    }
}