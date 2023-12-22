import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userCount = sc.nextInt();

        int free = 0;
        Set<Integer> colors = new HashSet<>();
        for (int i = 0; i < userCount; i++) {
            int rate = sc.nextInt() / 400;
            if (7 < rate) {
                free++;
            } else {
                colors.add(rate);
            }
        }
        int hold  = colors.size();
        System.out.println((hold == 0 ? 1 : hold) + " " + (hold + free));
    }
}