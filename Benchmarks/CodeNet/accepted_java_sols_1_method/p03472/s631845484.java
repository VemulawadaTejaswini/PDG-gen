import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        } 
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        List<Integer> bovermax = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            if (b[i] > max) {
                bovermax.add(b[i]);
            }
        }
        Collections.sort(bovermax, Collections.reverseOrder());
        int damage = 0;
        int counter = 0;
        for (int i = 0; i < bovermax.size(); i++) {
            damage += bovermax.get(i);
            counter++;
            if (damage >= H) {
                break;
            }
        }
        counter += ((H - Math.min(damage, H)) + max - 1) / max;
        System.out.println(counter);
        sc.close();
    }
}