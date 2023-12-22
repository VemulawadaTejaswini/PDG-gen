import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 主処理
        String str = s.replace("LR", "L,R");
        String[] array = str.split(",");
        Deque<Integer> countR = new ArrayDeque<>();
        Deque<Integer> countL = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            int count = array[i].length();
            if (count % 2 == 0) {
                int half = count / 2;
                countR.add(half);
                countL.add(half);
            } else {
                int r = array[i].replace("L", "").length();
                // int l = array[i].replace("R", "").length();
                if (r % 2 == 1) {
                    countL.add(count / 2);
                    countR.add((int) Math.ceil(count / 2.0));
                } else {
                    countR.add(count / 2);
                    countL.add((int) Math.ceil(count / 2.0));
                }
            }
        }
        int[] countArray = new int[s.length()];
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'R' && s.charAt(i + 1) == 'L') {
                countArray[i] = countR.poll();
                countArray[i + 1] = countL.poll();
                i++;
            }
        }

        String[] strArray = new String[s.length()];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = Integer.toString(countArray[i]);
        }
        String result = String.join(" ", strArray);

        // 出力
        System.out.println(result);
        sc.close();
    }
}
