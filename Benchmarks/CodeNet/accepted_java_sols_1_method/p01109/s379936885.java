import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n;
        int sum;
        int count;
        int income[] = new int[10000];
        Scanner sc = new Scanner(System.in);
        while ((n = Integer.parseInt(sc.next())) != 0) {
            sum = 0;
            for (int i = 0; i < n; i++) {
                income[i] =  Integer.parseInt(sc.next());
                sum += income[i];
            }
            int average = sum / n;
            count = 0;
            for (int i = 0; i < n; i++) {
                if (income[i] <= average) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}

