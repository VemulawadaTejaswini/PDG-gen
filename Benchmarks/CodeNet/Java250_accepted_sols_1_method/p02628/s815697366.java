import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k, n;
        n = sc.nextInt();
        k = sc.nextInt();
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while(i < n){
            list.add(sc.nextInt());
            i++;
        }
        sc.close();
        Collections.sort(list);
        i = 0;
        int sum = 0;
        while(i < k){
            sum += list.get(i);
            i++;
        }
        System.out.println(sum);
    }
}
