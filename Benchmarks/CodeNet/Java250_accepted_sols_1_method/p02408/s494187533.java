import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> S = new ArrayList<>();
        List<Integer> H = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        List<Integer> D = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String symbol = sc.next();
            int num = sc.nextInt();

            if ("S".equals(symbol)) {
                S.add(num);
            } else if ("H".equals(symbol)) {
                H.add(num);
            } else if ("C".equals(symbol)) {
                C.add(num);
            } else {
                D.add(num);
            }
        }
       
        for (int i = 1; i < 14; i++) {
            if (!S.contains(i)) {
                System.out.println("S" + " " + i);
            }
        }
        for (int i = 1; i < 14; i++) {
            if (!H.contains(i)) {
                System.out.println("H" + " " + i);
            }
        }
        for (int i = 1; i < 14; i++) {
            if (!C.contains(i)) {
                System.out.println("C" + " " + i);
            }
        }
        for (int i = 1; i < 14; i++) {
            if (!D.contains(i)) {
                System.out.println("D" + " " + i);
            }
        }
    }
}