import java.util.Scanner;

class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int ans = 0;
        for (; a<=b; a++) {
            if(c%a==0) ++ans;
        }
        System.out.println(ans);
    }
}