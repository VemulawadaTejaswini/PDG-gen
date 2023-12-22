import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = in.nextInt();
        int b = in.nextInt();
        int k = in.nextInt();
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = a; i <= b; i++){
            if( !list.contains(i) ) list.add(i);
            count++;
            if (count == k) break;
        }
        count = 0;
        for (int i = b; i >= a; i--){
            if (!list.contains(i)) list.add(i);
            count++;
            if (count == k) break;
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}