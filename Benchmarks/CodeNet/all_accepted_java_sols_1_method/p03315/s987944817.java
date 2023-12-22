import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int res = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '+') {
                res ++;
            } else {
                res --;
            }
        }
        System.out.println(res);
    }
}
