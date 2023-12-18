import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String s = kbd.next();
        String[] temp = s.split("");
        int cou = 0;
        int nokori = 15 - temp.length;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals("o")) {
                cou++;
            }
        }

        if (cou >= 8 || cou + nokori >= 8) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}