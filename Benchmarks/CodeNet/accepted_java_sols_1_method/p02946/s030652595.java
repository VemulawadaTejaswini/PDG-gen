import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int K = Integer.parseInt(scan.next()); 
        int X = Integer.parseInt(scan.next()); 
        scan.close();

        String result = "";
        for (int i = X - K + 1; i < X + K; i++) {
            result += String.valueOf(i) + " ";
        }

        System.out.println(result);
    }
}