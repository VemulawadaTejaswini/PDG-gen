import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        Integer num[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        Arrays.sort(num, Collections.reverseOrder());
        int Alice = 0;
        int Bob = 0;
        for(int i=0; i< num.length; i++) {
            if(i % 2 ==0 ) {
                Alice = Alice + num[i];
            } else {
                Bob = Bob + num[i];
            }
        }
        System.out.print(Alice - Bob);
    }
}

