import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int cnt = 0;
        while (h > 0) {
            h -= a;
            cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
