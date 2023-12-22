import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        ArrayList<Integer> id = new ArrayList<>();
 
        l[0] = scanner.nextInt();
        r[0] = scanner.nextInt();
        for (int i = l[0]; i <= r[0]; i++) {
            id.add(i);
        }
 
        if(m > 1) {
            for (int i = 1; i < m; i++) {
                l[i] = scanner.nextInt();
                r[i] = scanner.nextInt();
 
                if (id.size() == 0) {
                    break;
                }
 
                while (id.get(0) < l[i]) {
                    id.remove(0);
                    if (id.size() == 0) {
                        break;
                    }
                }
                              if (id.size() == 0) {
                    break;
                }
                while (id.get(id.size() - 1) > r[i]) {
                    id.remove(id.size() - 1);
                    if (id.size() == 0) {
                        break;
                    }
                }
            }
        }
        System.out.println(id.size());
    }
}