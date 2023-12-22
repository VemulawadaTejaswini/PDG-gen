import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");
            String[] dList = sc.nextLine().split(" ");

            Arrays.sort(dList,  Collections.reverseOrder());

            int h = Integer.valueOf(line[0]);

            for (String d : dList) {
                h -= Integer.valueOf(d);

                if (h <= 0) {
                    System.out.println("Yes");
                    return;
                }
            }

            // 出力
            System.out.println("No");
        }
    }
}