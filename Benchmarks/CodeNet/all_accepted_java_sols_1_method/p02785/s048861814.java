import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        List<Long> enemyList = new ArrayList<>();
        for(int i=0;i<N;i++){
                enemyList.add(Long.parseLong(sc.next()));
        }
        int res = enemyList.size() - K >= 0 ? enemyList.size() - K : 0;
        Collections.sort(enemyList);
        List<Long> resList = enemyList.subList(0,res);
        long total = resList.stream().reduce(0L,(s1,s2) -> s1 + s2);
        System.out.println(total);
    }
}
