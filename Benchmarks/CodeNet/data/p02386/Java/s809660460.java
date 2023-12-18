import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Dice[] dList = new Dice[n];
        Set<String> list = new HashSet<String>();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (list.contains(line)) {
                System.out.println("No");
                return;
            }
            list.add(line);
            String[] lines = line.split(" ");
            dList[i] = new Dice(lines);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dList[i].check() && dList[j].check()) {
                    System.out.println("No");
                    return;
                }
                dList[i].getRight(dList[j].getNumber(0), dList[j].getNumber(1));
                int k = 0;
                for (; k < 6; k++) {
                    if (!dList[i].getNumber(k).equals(dList[j].getNumber(k))) {
                        break;
                    }
                }
                if (k >= 6){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}

class Dice {
    String[] s = new String[6];
    int[] d = { 0, 1, 2 };
    static String a = "";
    static String b = "";

    Dice(String[] s) {
        this.s = s;
    }

    boolean check() {
        int aCount = 0;
        int bCount = 0;
        for (String n : s) {
            if (a.isEmpty()) {
                a = n;
                aCount++;
                continue;
            }
            if (a.equals(n)) {
                aCount++;
                continue;
            }
            if (b.isEmpty()) {
                b = n;
                bCount++;
                continue;
            }
            if (b.equals(n)) {
                bCount++;
                continue;
            }
            return false;
        }
        if (aCount * bCount == 5) {
            return true;
        }
        return false;
    }

    String getNumber() {
        return s[d[0]];
    }

    String getNumber(int n) {
        n = n < 3 ? d[n] : 5 - d[5 - n];
        return s[n];
    }

    void roll(char n) {
        int a = 0;
        int b = 0;
        switch (n) {
        case 'N':
            a = 0;
            b = 1;
            break;
        case 'E':
            a = 2;
            b = 0;
            break;
        case 'S':
            a = 1;
            b = 0;
            break;
        case 'W':
            a = 0;
            b = 2;
            break;
        case 'H':
            a = 1;
            b = 2;
            break;
        }
        int temp = d[a];
        d[a] = d[b];
        d[b] = 5 - temp;
    }

    String getRight(String[] list) {
        for (int i = 0; i < 3; i++) {
            if (getNumber().equals(list[0])) {
                break;
            }
            roll('N');
        }
        for (int i = 0; i < 3; i++) {
            if (getNumber().equals(list[0])) {
                break;
            }
            roll('W');
        }
        for (int i = 0; i < 3; i++) {
            if (s[d[1]].equals(list[1])) {
                break;
            }
            roll('H');
        }
        return s[d[2]];
    }

    String getRight(String str1, String str2) {
        for (int i = 0; i < 3; i++) {
            if (getNumber().equals(str1)) {
                break;
            }
            roll('N');
        }
        for (int i = 0; i < 3; i++) {
            if (getNumber().equals(str1)) {
                break;
            }
            roll('W');
        }
        for (int i = 0; i < 3; i++) {
            if (s[d[1]].equals(str2)) {
                break;
            }
            roll('H');
        }
        return s[d[2]];
    }
}