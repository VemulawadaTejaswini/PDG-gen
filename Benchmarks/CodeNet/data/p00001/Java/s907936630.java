import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        while (sc.hasNext()) list.add(sc.nextInt());
        Collections.sort(list);
        for (int i = 0; i < 3; i++) System.out.println(list.get(list.size() - i - 1));
    }
}