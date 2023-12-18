
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < h; i++) {
            char[] chs = sc.next().toCharArray();
            for (char ch: chs) count.put(ch, count.getOrDefault(ch, 0) + 1);
        }

        int count4 = 0;
        int count2 = 0;
        int countOther = 0;
        for (int c : count.values()) {
            if(c % 4 == 0) count4++;
            else if(c % 2 == 0) count2++;
            else countOther++;
        }


        boolean valid = true;
        if(h % 2 == 0 && w % 2 == 0) {
            if(count2 > 0 || countOther > 0) valid = false;
        } else if(h % 2 != 0 && w % 2 != 0) {
            if(countOther > 1 || count2 > h / 2 + w / 2) valid = false;
        } else if(h % 2 == 0 && w % 2 != 0){
            if(count2 > h / 2 || countOther > 0) valid = false;
        } else {
            if(count2 > w / 2 || countOther > 0) valid = false;
        }
        if(valid) System.out.println("Yes");
        else System.out.println("No");
    }
}