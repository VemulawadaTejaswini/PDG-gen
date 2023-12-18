
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yoshizaki
 *151
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<String>();
        int qcount = scanner.nextInt();
        int submitCount = scanner.nextInt();
        for (int i = 1 ; i <= submitCount ; i++) {
            scanner.nextLine();
            deque.push(scanner.next());
            deque.push(scanner.next());
        }
        
        int ac = 0;
        int wa = 0;
        int waMemo = 0;
        String qnum = "";
        String  result = "";
        Map<String,String> submitted = new HashMap<String,String>();
        
        while (deque.peek() != null) {
            qnum = deque.pollLast();
            result = deque.pollLast();
            // 正解済みなら何もしない。
            if (submitted.containsKey(qnum) && submitted.get(qnum).equals("AC")) {
                continue;
            }
            // 正解してなくてWAなら誤答数のメモを1増やす。
            if (result.equals("WA")) {
                if (submitted.containsKey(qnum)) {
                    waMemo = Integer.valueOf(submitted.get(qnum));
                } else {
                    waMemo = 0;
                }
                waMemo++;
                submitted.put(qnum, String.valueOf(waMemo));
                continue;
            }
            // 正解した時に正答数を１増やす、正解した問題を記録する。
            if (result.equals("AC")) {
                ac++;
                if (submitted.containsKey(qnum)) {
                    wa = wa + Integer.valueOf(submitted.get(qnum));
                }
                submitted.put(qnum, result);
                waMemo = 0;
                continue;
            }
            
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ac).append(" ").append(wa);
        System.out.println(sb.toString());
    }
}