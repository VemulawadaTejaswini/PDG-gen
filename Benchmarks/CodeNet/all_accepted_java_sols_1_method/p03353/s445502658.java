
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by oka on 2018/06/05.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        List<String> list = new ArrayList<String>();
        start_loop: for (int start = 0; start < s.length(); start++) {
            end_loop: for (int end = start+1; end <= s.length(); end++) {
                String substr = s.substring(start, end);
                for (int i = 0; i < k; i++) {
                    if (list.size() == i) {
                        list.add(substr);
                        continue end_loop;
                    } else {
                        String str = list.get(i);
                        int compareResult = str.compareTo(substr);
                        if (compareResult == 0) {
                            continue end_loop;
                        } else if (compareResult > 0) {
                            list.add(i, substr);
                            continue end_loop;
                        }
                    }
                }
                continue start_loop;
            }
        }

        System.out.println(list.get(k-1));
    }
}
