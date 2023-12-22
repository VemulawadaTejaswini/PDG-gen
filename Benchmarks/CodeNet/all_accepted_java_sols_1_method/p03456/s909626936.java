import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            int num = Integer.parseInt(input[0] + input[1]);
            double sqrtOfNumber = Math.sqrt(num);
            if (sqrtOfNumber == Math.floor(sqrtOfNumber)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}