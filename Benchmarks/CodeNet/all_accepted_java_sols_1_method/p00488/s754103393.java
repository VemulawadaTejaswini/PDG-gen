import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = Math.min(Math.min(sc.nextInt(), sc.nextInt()), sc.nextInt()) + Math.min(sc.nextInt(), sc.nextInt()) - 50;
        System.out.println(ans);
    }
}

