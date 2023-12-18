import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            aList.add(scan.nextInt());
        }
        for (int i = 0; i < m; i++) {
            bList.add(scan.nextInt());
        }

        int ans = 0;
        int time = 0;

        int aMaxIndex = -1;
        int bMaxIndex = -1;

        int count1 = n;
        while (count1 > 0) {
            if (time + aList.get(aMaxIndex + 1) <= k) {
                time += aList.get(aMaxIndex + 1);
                ++ans;
                ++aMaxIndex;
            }
            --count1;
        }

        int count2 = m;
        while (count2 > 0) {
            if (time + bList.get(bMaxIndex + 1) <= k) {
                time += bList.get(bMaxIndex + 1);
                ++ans;
                ++bMaxIndex;
            }
            --count2;
        }

        int num = aMaxIndex;
        int ans2 = ans;
        for (int i = 0; i < num + 1; i++) {
            time -= aList.get(aMaxIndex);
            --aMaxIndex;
            --ans2;

            while (bMaxIndex < m - 1) {
                ++bMaxIndex;
                if (time + bList.get(bMaxIndex) <= k) {
                    time += bList.get(bMaxIndex);
                    ++ans2;
                }
                if (ans2 >= ans) {
                    ans = ans2;
                }
            }
        }

        //B追加の余裕がないか調べる
        int count3 = m - (bMaxIndex + 1);
        while (count3 > 0) {
            if (time + bList.get(bMaxIndex + 1) <= k) {
                time += bList.get(bMaxIndex + 1);
                ++ans2;
                ++bMaxIndex;
            }
            if (ans2 >= ans) {
                ans = ans2;
            }
            --count3;
        }

        System.out.println(ans);
    }
}