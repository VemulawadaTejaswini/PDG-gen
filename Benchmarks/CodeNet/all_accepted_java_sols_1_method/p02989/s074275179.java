import java.util.*;
import java.util.stream.Collector;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i < n;i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        int a = list.get(list.size()/2-1);
        int b = list.get(list.size()/2);
        System.out.println(b - a);
    }

}

