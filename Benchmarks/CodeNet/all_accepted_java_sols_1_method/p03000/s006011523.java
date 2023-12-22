import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        List<Integer> l = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            l.add(sc.nextInt());
        }

        int distance = 0;
        int cnt = 1;
        for(int i = 0; i < n; i++){
            distance += l.get(i);
            if(distance <= x) cnt++;
        }
        System.out.println(cnt);
        return;
    }
}
