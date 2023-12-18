import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        String X = s.next();
        final int N = s.nextInt();
        List<String> pList = new ArrayList<String>();

        for (int i = 0 ; i < N ; i++) {
            pList.add(s.next());
        }

        if (pList.size() == 0 || !pList.contains(X)) {
            System.out.println(X);
            return;
        }

        int idx = 1;
        while (true) {
            String minus = String.valueOf(Integer.parseInt(X) - idx);
            String plus = String.valueOf(Integer.parseInt(X) + idx);
          
          if (pList.contains(minus) && pList.contains(plus)) {
                idx++;
                continue;
            }

            if (!pList.contains(minus) && !pList.contains(plus)) {
                System.out.println(minus);
                break;
            } else if (!pList.contains(minus)) {
                System.out.println(minus);
                break;
            } else {
                System.out.println(plus);
                break;
            }
        }
    }
}