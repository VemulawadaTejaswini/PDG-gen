import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Integer, Integer> eMap = new HashMap<>();
        Map<Integer, Integer> oMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(sc.next());
            if ((i + 1) % 2 == 0) {
                eMap.merge(temp, 1, Integer::sum);
            } else {
                oMap.merge(temp, 1, Integer::sum);
            }
        }
        List<Map.Entry<Integer, Integer>> eList = new ArrayList<>(eMap.entrySet());
        List<Map.Entry<Integer, Integer>> oList = new ArrayList<>(oMap.entrySet());
        eList.sort(Map.Entry.comparingByValue());
        oList.sort(Map.Entry.comparingByValue());
        int eMax = eList.get(eList.size() - 1).getKey();
        int oMax = oList.get(oList.size() - 1).getKey();
        int ans = 0;
        if (eMax == oMax) {
            if (eMap.get(eMax).compareTo(oMap.get(oMax)) > 0) {
                ans += (n / 2) - eMap.get(eMax);
                if (oList.size() == 1) {
                    ans += oMap.get(oMax);
                } else {
                    ans += (n / 2) - oList.get(oList.size() - 2).getValue();
                }
            } else if (eMap.get(eMax).compareTo(oMap.get(oMax)) < 0) {
                ans += (n / 2) - oMap.get(oMax);
                if (eList.size() == 1) {
                    ans += eMap.get(eMax);
                } else {
                    ans += (n / 2) - eList.get(eList.size() - 2).getValue();
                }
            } else {
                ans += (n / 2) - oMap.get(oMax);
                if (eList.size() == 1) {
                    ans += eMap.get(eMax);
                } else if (eList.get(eList.size() - 2).getValue().compareTo(oList.get(oList.size() - 2).getValue()) > 0) {
                    ans += (n / 2) - eList.get(eList.size() - 2).getValue();
                } else {
                    ans += (n / 2) - oList.get(oList.size() - 2).getValue();
                }
            }
        } else {
            ans += (n / 2) - oList.get(oList.size() - 1).getValue();
            ans += (n / 2) - eList.get(eList.size() - 1).getValue();
        }
        System.out.println(ans);
    }
}