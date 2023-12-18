import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> cl = new ArrayList<Integer>();
            while(true) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                int count = 0;
                if (n == 0 && x == 0) {
                    break;
                }
                for (int i = 1; i <= n; i++) {
                    for (int j = i + 1; j <= n; j++) {
                        for (int k = j + 1; k <= n; k++) {
                            if (i != j && j != k && k != i) {
                                if (i + j + k == x) {
                                    count++;
                                }
                            }
                        }
                    }
                }
                cl.add(count);
            }
            for (int i = 0; i < cl.size(); i++) {
                System.out.println(cl.get(i));
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
            e.getStackTrace();
            System.exit(-1);
        }
    }
}