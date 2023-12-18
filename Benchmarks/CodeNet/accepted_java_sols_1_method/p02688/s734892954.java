import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++) {
            a.add(i+1);
        }
        for(int i=0; i<k; i++) {
            int b = sc.nextInt();
            for(int j=0; j<b;j++) {
                int c = sc.nextInt();
                a.remove(Integer.valueOf(c));
            }
        }
        System.out.println(a.size());
    }
}