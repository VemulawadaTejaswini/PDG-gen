import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        String[] ans = new String[h + 2];

        for (int i = 0; i < h + 2; ++i) {
            ans[i] = "";
        }

        for (int i = 0; i < w + 2; ++i) {
            ans[0] += "#";
            ans[h+1] += "#";
        }

        for (int i = 1; i < h + 1; ++i) {
            ans[i] += "#";
            ans[i] += sc.next();
            ans[i] += "#";
        }

        for (int i = 0; i < h + 2; ++i) {
            System.out.println(ans[i]);
        }
    }
}