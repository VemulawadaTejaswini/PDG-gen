import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ans = 0;
        int outlet = 1;
        while (outlet < b) {
            outlet--;
            outlet += a;
            ans++;
        }
        System.out.println(ans);
        sc.close();
    }
}