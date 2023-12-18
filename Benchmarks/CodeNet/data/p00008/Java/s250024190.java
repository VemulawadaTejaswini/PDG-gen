import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int combination = 0;
        
        for (int i = 0; i < 10; i++) {
            int sum1 = 0;
            sum1 += i;
            if (sum1 > n) {
                break;
            }
            for (int j = 0; j < 10; j++) {
                int sum2 = sum1;
                sum2 += j;
                if (sum2 > n) {
                    break;
                }
                for(int k = 0; k < 10; k++) {
                    int sum3 = sum2;
                    sum3 += k;
                    if (sum3 > n) {
                        break;
                    }
                    for(int l = 0; l < 10; l++) {
                        int sum4 = sum3;
                        sum4 += l;
                        if (sum4 == n) {
                            combination++;
                        }
                    }
                }
            }
        }
        System.out.println(combination);
    }
}