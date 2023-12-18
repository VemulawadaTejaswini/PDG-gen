import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int taro = 0;
        int hanako = 0;
        int n = scan.nextInt();
        for (int i = 0; i < n; ++i) {
            int c = scan.next().compareTo(scan.next());
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