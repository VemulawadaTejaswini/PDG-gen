
// 問題URL
//

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split("");
        String[] b = scanner.nextLine().split("");

        int count = 0;
        for(int i =0; i<3; i++) {
            if(a[i].equals(b[i])) {
                count++;
            }
        }

        System.out.println(count);
    }
}
