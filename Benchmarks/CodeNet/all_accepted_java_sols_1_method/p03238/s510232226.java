import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            list.add(sc.nextInt());
        }

        System.out.println(list.get(0) == 1 ? "Hello World" : list.get(1) + list.get(2));
    }
}
