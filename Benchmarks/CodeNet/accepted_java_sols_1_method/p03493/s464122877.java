import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int count = 0;
        for(int i=0; i<3; i++) {
            if ((a % 10) == 1) {
                count++;
            }
            a /= 10;
        }
        System.out.println(count);
    }
}
