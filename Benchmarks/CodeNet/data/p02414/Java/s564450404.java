
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        
        int n, m, l;
        n = scan.nextInt();
        m = scan.nextInt();
        l = scan.nextInt();
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                a.add(scan.nextInt());
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < l; j++) {
                b.add(scan.nextInt());
            }
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < l; j++) {
                int target = 0;
                for(int k = 0; k < m; k++) {
                    target += (a.get(i * m + k) * b.get(k * l + j));
                }
                if(j == 0) {
                    System.out.print(target);
                }
                else {
                    System.out.print(" " + target);
                }
            }
            System.out.println();
        }
    }
}