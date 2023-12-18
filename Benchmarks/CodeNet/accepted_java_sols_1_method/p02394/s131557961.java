import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        String str = "No";

        if (W >= x + r && 0 <= x - r) {
            if (H >= y + r && 0 <= y - r) {
                str = "Yes";
            }
        }

        System.out.println(str);
        sc.close();
    }

}
