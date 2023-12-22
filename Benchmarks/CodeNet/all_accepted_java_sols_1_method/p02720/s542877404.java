import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.next());
        ArrayList<Long> list = new ArrayList();
        for (long i = 1; i < 10; i++) {
            list.add(i);
        }
        if (k < 10) {
            System.out.println(list.get(k-1));
            return;
        }
        k -= 9;
        long one;
        ArrayList<Long> tmp = new ArrayList();
        while (!list.isEmpty()) {
            tmp = new ArrayList();
            for (long li: list) {
                one = li%10;
                if (one == 0) {
                    tmp.add(li*10 + 0);
                    tmp.add(li*10 + 1);
                    k -= 2;
                } else if (one == 9) {
                    tmp.add(li*10 + 8);
                    tmp.add(li*10 + 9);
                    k -= 2;
                } else {
                    for (long i = one-1; i < one+2; i++) {
                        tmp.add(li*10 + i);
                    }
                    k -= 3;
                }
            }
            if (k <= 0) {
                break;
            }
            list = tmp;
        }
        System.out.println(tmp.get(tmp.size() - 1 -  Math.abs(k)));
    }
}