import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=l; i<=r; i++) {
            if(i % d == 0) list.add(i);
        }
        System.out.println(list.size());
    }
}