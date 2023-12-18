import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");

            int N = Integer.parseInt(inputs[0]);
            int M = Integer.parseInt(inputs[1]);

            int startPos = 0;
            int endPos = 100000;

            Map<Integer,Integer> LR = new LinkedHashMap();
            for (int i = 0;i < M;i++) {
                String strLR = scanner.nextLine();
                String[] arrayLR = strLR.split(" ");

                 int L = Integer.parseInt(arrayLR[0]);
                 int R = Integer.parseInt(arrayLR[1]);

                if (startPos <= L) {
                    startPos = L;
                }
                
                if (endPos >= R) {
                    endPos = R;
                }
            }
        

            if (endPos >= startPos) {
                System.out.println(endPos - startPos + 1);
            } else {
                System.out.println(0);
            }
            
            scanner.close();
    }
}