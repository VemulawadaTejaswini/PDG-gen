import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        List<Long> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(Long.parseLong(sc.next()));
        }
        Collections.sort(list, Collections.reverseOrder());
        long total = list.get(0);
        for(int i=2; i<n; i++){
            total += list.get(i/2);
        }
        System.out.println(total);
    }
}