import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        String a = "Yes";
        if(W < x + r || H < y +r || 0 > x -r || 0 > y - r) {
            a = "No";
        }
        System.out.println(a);
    }

}
