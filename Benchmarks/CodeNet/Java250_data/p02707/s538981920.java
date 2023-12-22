import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer[] a = new Integer[n - 1];
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n - 1; i++) {
            list.add(Integer.parseInt(scanner.next()));
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer temp : list) {
            Integer count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }

        Integer[] total = new Integer[n];
        Arrays.fill(total, 0);
        for (Integer nKey : map.keySet())
        {
            total[nKey-1] = map.get(nKey);
        }

        for(int i = 0; i < total.length; i++) {
            System.out.println(total[i]);
        }
    }
}