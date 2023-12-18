import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            b.add(x);
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = n - i -1; j >= 0; j--) {
                if(b.get(j) == j+1){
                    a[i] = j + 1;
                    b.remove(j);
                    break;
                }
                if(j == 0) a = null;
            }
        }
        if(a != null){
            for (int i = n-1; i >= 0; i--) {
                System.out.println(a[i]);
            }
        }else System.out.println(-1);
        sc.close();
    }

}
