import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taro = 0;
        int hanako = 0;
        int scint = sc.nextInt();
        for (int i = 0; i < scint; ++i) {
            int c = sc.next().compareTo(sc.next());
            if (c > 0) {
                taro += 3;
            } else if (c == 0) {
                taro++;
                hanako++;
            } else {
                hanako += 3;
            }
        }
        System.out.println(taro + " " + hanako);
    }
}