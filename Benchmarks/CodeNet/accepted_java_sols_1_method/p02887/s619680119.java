
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        char[] x = scanner.next().toCharArray();

        char tmp = (char) -1;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(x[i] != tmp) {
                tmp = x[i];
                count++;
            }
        }

        System.out.println(count);
    }
}