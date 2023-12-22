import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (char c : s.toCharArray()) {
            if (c == 'N') count1++;
            if (c == 'W') count2++;
            if (c == 'S') count3++;
            if (c == 'E') count4++;
        }
        if ((count1 > 0 && count3 == 0) || (count3 > 0 && count1 == 0)
            || (count2 > 0 && count4 == 0) || (count4 > 0 && count2 == 0)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
