import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        int N = Integer.parseInt(input);
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (i < 10) {
                count++;
                continue;
            }
            String x = String.valueOf(i);
            if(x.length() % 2 != 0) {
                count++;
            }
        }
        
        System.out.println(count);

    }
}