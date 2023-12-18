import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long max = 0;
        List<List<Long>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            List<Long> list = new ArrayList<>();
            list.add(x);
            list.add(y);
            if (lists.size() == 0) {
                lists.add(list);
            } else {
                for (int j = 0; j < lists.size(); j++) {
                    List<Long> node = lists.get(j);
                    long d = Math.abs(x - node.get(0)) + Math.abs(y - node.get(1));
                    if (d > max) {
                        max = d;
                        lists.clear();
                        lists.add(list);
                        lists.add(node);
                    }
                }
            }

        }
        System.out.println(max);
	}
}