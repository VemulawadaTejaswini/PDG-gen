import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int num;
            while((num = scn.nextInt()) > 0) {
                int min = scn.nextInt();
                int max = scn.nextInt();

                List<Integer> list = new ArrayList<>();
                for(int i = 0; i < num; i++) {
                    list.add(scn.nextInt());
                }
                Collections.sort(list);
                Collections.reverse(list);

                int ans = 0;
                int gap = 0;
                for(int i = min; i <= max; i++) {
                    int tmp = list.get(~-i) - list.get(i);
                    if(gap <= tmp) {
                        gap = tmp;
                        ans = i;
                    }
                }

                System.out.println(ans);
            }
        }
    }
}