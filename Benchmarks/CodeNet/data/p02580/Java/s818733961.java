import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int M = sc.nextInt();
        int[] hs = new int[M];
        int[] ws = new int[M];
        for (int m = 0; m < M; m++) {
            hs[m] = Integer.parseInt(sc.next());
            ws[m] = Integer.parseInt(sc.next());
        }
        
        List<Integer> hsList = new ArrayList<Integer>();
        List<Integer> wsList = new ArrayList<Integer>();
        for (int i = 0; i < M; i++) {
            hsList.add(hs[i]);
            wsList.add(ws[i]);
        }
        int[] hash_hs = deduplication(hs);
        int[] hash_ws = deduplication(ws);

        int max_h = 0, max_w = 0, h_freq = 0, w_freq = 0, max_h_freq = 0, max_w_freq = 0;
        for (int i = 0; i < M; i++) {
            h_freq = Collections.frequency(hsList, hs[i]);
            w_freq = Collections.frequency(wsList, ws[i]);
            if (h_freq > max_h_freq) {
                max_h = hs[i];
                max_h_freq = h_freq;
            }
            if (w_freq > max_w_freq) {
                max_w = ws[i];
                max_w_freq = w_freq;
            }
        }
        int dup = 0;
        for (int i = 0; i < M; i++){
            if ((hs[i] == max_h) && (ws[i] == max_w)) {
                dup = 1;
                break;
            }
        }
        System.out.println(max_h_freq + max_w_freq - dup);

    }
    private static int[] deduplication (int[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        int[] newNums = new int[list.size()];
        for (int i = 0; i < newNums.length; i++) {
            newNums[i] = list.get(i);
        }
        return newNums;
    }
}