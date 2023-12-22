
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());
        Integer c = Integer.parseInt(scanner.next());
        Integer d = Integer.parseInt(scanner.next());

        int count_a = 0;
        for(int i =0; i < 101; i++) {
            a -= d;
            if(a <= 0) break;
            count_a++;
        }

        int count_b = 0;
        for(int j =0; j < 101; j++) {
            c -= b;
            if(c <= 0) break;
            count_b++;
        }

        if(count_a >= count_b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}
