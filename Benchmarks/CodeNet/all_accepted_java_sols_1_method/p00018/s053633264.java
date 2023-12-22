import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            num.add(Integer.parseInt(sc.next()));
        }
        
        num.sort((o1, o2) -> {
            if (o1 > o2) return -1;
            if (o1 < o2) return 1;
            return 0;
        });
        
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.println(num.get(i));
            } else {
                System.out.printf("%d ", num.get(i));
            }
        }
    }
}