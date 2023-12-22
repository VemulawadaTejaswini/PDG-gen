import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder(sc.nextLine());

        sb.setCharAt(k-1, Character.toLowerCase(sb.charAt(k-1)));
        System.out.println(sb);
    }
}