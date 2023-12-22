import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        int remain = a - b;
        int ans = c - remain > 0 ? c - remain : 0;
        System.out.println(ans);
    }

}
