import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int S, h, m, s;
        Scanner sc = new Scanner(System.in);
        S = sc.nextInt();
        h = (int)(S / 3600);
        m = (int)((S % 3600) / 60);
        s = S % 60;
        System.out.println(h+":"+m+":"+s);
    }
}
