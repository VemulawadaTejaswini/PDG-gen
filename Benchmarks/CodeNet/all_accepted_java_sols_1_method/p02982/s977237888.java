import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int point = Integer.parseInt(sc.next());
        int jigen = Integer.parseInt(sc.next());
        List<List<Integer>> pointList = new ArrayList();
        for (int x=1; x<=point; x++) {
            List<Integer> list = new ArrayList();
            for (int y=1; y<=jigen; y++) {
                list.add(Integer.parseInt(sc.next()));
            }
            pointList.add(list);
        }
        int res = 0;
        for(int x=1;x<=point;x++) {
            List<Integer> compareList = pointList.get(x-1);
            for (int y=1;y<=point;y++) {
                if (x==y) {
                    continue;
                }
                List<Integer> list = pointList.get(y-1);
                int r = 0;
                for (int z=1;z<=jigen;z++) {
                    int tmp1 = compareList.get(z-1);
                    int tmp2 = list.get(z-1);
                    r += (int)Math.pow(tmp1-tmp2,2);
                }
                double tmp = Math.sqrt(r);
                double a = (int) tmp;
                if (a*a ==tmp*tmp) {
                    res++;
                }
                
            }
        }
        System.out.println(res/2);
    }
}
