import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        int h = 0;

        for (int i = 0; i < n; i++) {
            String tw = sc.next();
            String hw = sc.next();
            if (tw.compareTo(hw) > 0) {
                t += 3;
            } else if (tw.compareTo(hw) < 0) {
                h += 3;
            } else {
                t++;
                h++;
            }
        }

        System.out.println(String.format("%d %d", t, h));
    }
}