import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (c % i == 0) cnt++;
        }
        System.out.println(cnt);
    }
}
