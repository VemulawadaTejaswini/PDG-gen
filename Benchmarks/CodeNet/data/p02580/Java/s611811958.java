import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int M = sc.nextInt();
        Integer[] hs = new Integer[M];
        Integer[] ws = new Integer[M];
        for (int m = 0; m < M; m++) {
            hs[m] = Integer.parseInt(sc.next());
            ws[m] = Integer.parseInt(sc.next());
        }
        
        Integer[] hash_hs = deduplication(hs);
        Integer[] hash_ws = deduplication(ws);
        List<Integer> hsList = Arrays.asList(hs);
        List<Integer> wsList = Arrays.asList(ws);
        int len = (int) Math.min(hash_hs.length, hash_ws.length);
        int max_h = 0, max_w = 0, h_freq = 0, w_freq = 0, max_h_freq = 0, max_w_freq = 0;
        for (int i = 0; i < len; i++) {
            h_freq = Collections.frequency(hsList, hash_hs[i]);
            w_freq = Collections.frequency(wsList, hash_ws[i]);
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
    private static Integer[] deduplication (Integer[] nums) {

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }

        Integer[] newNums = new Integer[list.size()];
        for (int i = 0; i < newNums.length; i++) {
            newNums[i] = list.get(i);
        }
        return newNums;
    }
}