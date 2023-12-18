import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n == 0 && r == 0) break;
            
            List<Integer> card = new ArrayList<>();
            for(int i = n; i > 0; i--) {
                card.add(i);
            }

            for(int i = 0; i < r; i++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                List<Integer> v1 = new ArrayList<>();
                List<Integer> v2 = new ArrayList<>();
                List<Integer> v3 = new ArrayList<>();
                for(int j = 0; j < n; j++) {
                    if(j < p - 1) v1.add(card.get(j));
                    else if(j < p - 1 + c) v2.add(card.get(j));
                    else v3.add(card.get(j));
                }
                for(int j = 0; j < v1.size(); j++) {
                    v2.add(v1.get(j));
                }
                for(int j = 0; j < v3.size(); j++) {
                    v2.add(v3.get(j));
                }
                card = v2;
            }

            System.out.println(card.get(0));
        }
    }
}
