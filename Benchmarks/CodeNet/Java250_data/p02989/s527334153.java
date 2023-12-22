import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        for (int x =1; x <= total ; x++) {
            list.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(list);
        int x = list.get(total/2-1);
        int y = list.get(total/2);
        System.out.println(y-x);
    }
}
