import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = "" + N;
        int sum = 0;
        for (char tmp : str.toCharArray()) {
            sum += Integer.parseInt("" + tmp);
        }
        if(N % sum == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
