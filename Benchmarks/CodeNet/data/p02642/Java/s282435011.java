import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> noMap = new TreeMap<>();
        for (int i=1;i<=n;i++) {
            int x = sc.nextInt();
            if (noMap.containsKey(x)) {
                noMap.put(x,0);
            } else {
                noMap.put(x, 1);
            }
        }

        Set<Integer> waruSet = new HashSet<>();
        int ans=0;
        for (int key : noMap.keySet()) {
            int hantei=0;
            for(int value : waruSet){
                if (key%value == 0) {
                    hantei=1;
                    break;
                }
            }
            if(hantei==0){
                waruSet.add(key);
                if(noMap.get(key)==1){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
