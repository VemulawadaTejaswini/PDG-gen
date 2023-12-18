import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        while(true) {
            int n = num.nextInt();
            int x = num.nextInt();
            int sum = 0;

            if(n == 0 && x == 0) {
                break;
            }

            for(int i = 1; i < n - 1; i++) {
                for(int j = i + 1; j < n; j++) {
                    for(int k = j + 1; k < n + 1; k++) {
                        if((i + j + k) == x) {
                            sum++;
                        }
                    }
                }
            }
            System.out.println(sum);
        }

        
    }
}
