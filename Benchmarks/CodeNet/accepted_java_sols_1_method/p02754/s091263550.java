import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        long length = scanner.nextLong();
        long blue = scanner.nextLong();
        long red = scanner.nextLong();

        long sum = blue + red;
        long div = length / sum;
        long rem = length % sum;

        long blueCount = (div * blue);

        if (rem > 0) {
            blueCount += Math.min(rem, blue);
        }
        System.out.println(blueCount);
    }
}