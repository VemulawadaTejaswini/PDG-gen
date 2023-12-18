import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String x = sc.next();
            if (x.equals("0")) {
                break;
            }
            int answer = 0;
            int len = x.length();
            String[] array = new String[len];
            for (int i = 0; i < len; i++) {
                array[i] = x.substring(i, i+1);
                answer += Integer.parseInt(array[i]);
            }
            System.out.println(answer);
        }
        sc.close();
    }
}
