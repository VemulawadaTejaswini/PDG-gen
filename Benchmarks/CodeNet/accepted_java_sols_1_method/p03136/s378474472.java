import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; ++i) {
            int length = reader.nextInt();
            sum += length;
            if (length > max)
                max = length;
        }
        reader.close();
        System.out.println(sum - max > max ? "Yes" : "No");
    }
}