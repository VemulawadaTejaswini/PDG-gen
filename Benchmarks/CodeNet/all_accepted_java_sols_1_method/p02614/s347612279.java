import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int k = sc.nextInt();
        char[][] array = new char[h][];
        long ans = 0;
        for (int i = 0; i < h; i++) {
            array[i] = sc.next().toCharArray();
        }
        int hMax = (int)Math.pow(2, w);
        int wMax = (int)Math.pow(2, h);

        for (int i = 0; i < hMax; i++) {
            int hi = i;
            boolean[][] searched = new boolean[h][w];
            while (Integer.bitCount(hi) > 0) {
                int ht = Integer.lowestOneBit(hi);
                hi -= ht;
                ht = (int)(Math.log(ht) / Math.log(2));
                for (int j = 0; j < h; j++) {
                    searched[j][ht] = true;
                }
            }
            for (int j = 0; j < wMax; j++) {
                int wi = j;
                boolean[][] searchedCopy =  new boolean[h][w];
                for (int l = 0; l < h; l++) {
                    System.arraycopy(searched[l], 0, searchedCopy[l], 0, w);
                }
                while (Integer.bitCount(wi) > 0) {
                    int wt = Integer.lowestOneBit(wi);
                    wi -= wt;
                    wt = (int)(Math.log(wt) / Math.log(2));
                    Arrays.fill(searchedCopy[wt], true);
                }
                int count = 0;
                for (int o = 0; o < h; o++) {
                    for (int l = 0; l < w; l++) {
                        if (!searchedCopy[o][l] && array[o][l] == '#') {
                            count++;
                        }
                    }
                }
                if (count == k) {
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}