import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        int result = 0;
        for (int i = 0; i < 3; i++) {
            String s_char = s.substring(i,i +1);
            String t_char = t.substring(i,i +1);
            if (s_char.equals(t_char)) result++;
        }
        System.out.println(result);
    }
}