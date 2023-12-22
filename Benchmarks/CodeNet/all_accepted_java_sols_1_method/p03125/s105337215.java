import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {    public static void main(String[] args) {
    int aValue;
    int bValue;
    int answer;

    Scanner scanner = new Scanner(System.in);

    String A = scanner.next();
    String B = scanner.next();

    aValue = Integer.valueOf(A);
    bValue = Integer.valueOf(B);

    if (bValue % aValue == 0) {
       answer = bValue + aValue ;
    } else {
        answer = bValue - aValue;
    }
    System.out.println(answer);

    }
}
