
import java.util.*;

public class Main {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> cards = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i < n;i++){
            cards.add(sc.nextInt());
        }

        for(int i = 0;i < m;i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            map.merge(c, b,
                    (v1, v2) -> {
                        return v1+v2;
                    });
        }

        Collections.sort(cards);
        List<Integer> changes = new ArrayList<>();
        changes.addAll(map.keySet());
        Collections.sort(changes);

        long sum = 0;
        int cIndex = changes.size()-1;
        int change = changes.get(cIndex);
        int cNum = map.get(change);
        for(int i = 0;i < n;i++){
            if(cards.get(i) <= change){
                sum += change;
                cNum--;
                if(cNum == 0){
                    cIndex--;
                    if(cIndex < 0){
                        for(int j = i+1;j < n;j++){
                            sum += cards.get(j);
                        }
                        break;
                    }
                    change = changes.get(cIndex);
                    cNum = map.get(change);
                }
            } else {
                for(int j = i;j < n;j++){
                    sum += cards.get(j);
                }
                break;
            }
        }
        System.out.println(sum);
    }
}