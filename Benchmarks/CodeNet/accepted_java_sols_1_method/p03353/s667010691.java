import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j <= s.length() - i; j++) {
                list.add(s.substring(j, j + i));
            }
        }
        Collections.sort(list);
        if (k == 1) {
            System.out.println(list.get(0));
        } else {
            int count = 1;
            int i = 1;
            String str = list.get(0);
            while (count != k) {
                if (!list.get(i).equals(str)) {
                    count++;
                    str = list.get(i);
                }
                i++;
            }
            System.out.println(str);
        }

    }

}