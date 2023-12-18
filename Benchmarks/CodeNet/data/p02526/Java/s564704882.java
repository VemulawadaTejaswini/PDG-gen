import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet S = new HashSet();
        for (int i = 0; i < n; i++){
            S.add(sc.nextInt());
        }
        int q = sc.nextInt();
        int c = 0;
        for (int i = 0; i < q; i++){
            if (S.contains(sc.nextInt())){
                c++;
            }
        }
        System.out.println(c);
    }
}