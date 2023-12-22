import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        for (int i = a; i <= b; i++) {
            String tmp = Integer.toString(i);
            if(tmp.substring(0, 1).equals(tmp.substring(4, 5)) &&
                    tmp.substring(1, 2).equals(tmp.substring(3, 4))) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}