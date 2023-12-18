import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int evenCount = k/2;
        int oddCount = k - evenCount;

        System.out.println(evenCount * oddCount);
    }
}
