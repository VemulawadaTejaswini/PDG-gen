import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int [3];
        for (int i = 0; i < 3 ; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int largestNum = a[2];
        int mediumNum = a[1];
        int smallestNum = a[0];
        int diffLM = largestNum - mediumNum;
        int diffLS = largestNum - smallestNum;
        if (diffLM % 2 == 0 && diffLS % 2 == 0) {
            System.out.println(diffLM/2 + diffLS/2);
        } else if (diffLM % 2 != 0 && diffLS % 2 != 0) {
            System.out.println(diffLM/2 + diffLS/2 + 1);
        } else {
            System.out.println(diffLM/2 + diffLS/2 +2);
        }

    }

}