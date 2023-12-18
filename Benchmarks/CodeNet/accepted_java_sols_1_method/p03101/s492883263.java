import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int high = sc.nextInt();
        int row = sc.nextInt();
        int nuruHigh = sc.nextInt();
        int nuruRow = sc.nextInt();

        int whiteHigh = high - nuruHigh;
        int whiteRow = row - nuruRow;

        System.out.println(whiteHigh * whiteRow);
    }
}