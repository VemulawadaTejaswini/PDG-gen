import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        Map<Integer, Integer> xM = new HashMap();
        Map<Integer, Integer> yM = new HashMap();
        Set<String> S = new HashSet();
        for (int i = 1; i <= k; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            xM.put(x, xM.getOrDefault(x, 0) + 1);
            yM.put(y, yM.getOrDefault(y, 0) + 1);
            String st = x + "-" + y;
            S.add(st);
        }
        int mxNum = 0;
        for (int val : xM.values()) mxNum = Math.max(mxNum, val);
        int myNum = 0;
        for (int val : yM.values()) myNum = Math.max(myNum, val);
        List<Integer> listx = new ArrayList();
        for (int key : xM.keySet()) {
            if (xM.get(key) == mxNum) listx.add(key);
        }
        List<Integer> listy = new ArrayList();
        for (int key : yM.keySet()) {
            if (yM.get(key) == myNum) listy.add(key);
        }
        int ans = mxNum + myNum - 1;
        for (int i = 0; i < listx.size(); i++) {
            for (int j = 0; j < listy.size(); j++) {
                String st = listx.get(i) + "-" + listy.get(j);
                if (S.contains(st) == false) {
                    System.out.println(ans + 1);
                    return;
                }
            }
        }
        System.out.println(ans);
    }
}
