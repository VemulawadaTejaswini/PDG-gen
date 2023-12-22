import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        int a1,a2,a3,b1,b2,b3,c1,c2,c3;
        a1 = Integer.parseInt(values[0]);
        a2 = Integer.parseInt(values[1]);
        a3 = Integer.parseInt(values[2]);
        line = scanner.nextLine();
        values = line.split(" ");
        b1 = Integer.parseInt(values[0]);
        b2 = Integer.parseInt(values[1]);
        b3 = Integer.parseInt(values[2]);
        line = scanner.nextLine();
        values = line.split(" ");
        c1 = Integer.parseInt(values[0]);
        c2 = Integer.parseInt(values[1]);
        c3 = Integer.parseInt(values[2]);
        line = scanner.nextLine();
        values = line.split(" ");
        int n = Integer.parseInt(values[0]);
        boolean a = false,aa = false,aaa = false,b = false,bb = false,bbb = false,c = false,cc = false,ccc = false;
        for (int i = 0; i < n; i++) {
            line = scanner.nextLine();
            values = line.split(" ");
            int curr = Integer.parseInt(values[0]);
            if (curr == a1) {
                a = true;
            }
            if (curr == a2) {
                aa = true;
            }
            if (curr == a3) {
                aaa = true;
            }
            if (curr == b1) {
                b = true;
            }
            if (curr == b2) {
                bb = true;
            }
            if (curr == b3) {
                bbb = true;
            }
            if (curr == c1) {
                c = true;
            }
            if (curr == c2) {
                cc = true;
            }
            if (curr == c3) {
                ccc = true;
            }
        }
        boolean ret = false;
        if (a && aa & aaa) {
            ret = true;
        }
        if (b && bb && bbb) {
            ret = true;
        }
        if (c && cc && ccc) {
            ret = true;
        }
        if (a && b && c) {
            ret = true;
        }
        if (aa && bb && cc) {
            ret = true;
        }
        if (aaa && bbb && ccc) {
            ret = true;
        }
        if (a && bb && ccc) {
            ret = true;
        }
        if (aaa && bb && c) {
            ret = true;
        }
        System.out.println(ret ? "Yes" : "No");
    }
}