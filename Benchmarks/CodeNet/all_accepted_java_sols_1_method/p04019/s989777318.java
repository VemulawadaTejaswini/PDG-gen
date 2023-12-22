import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // N W S E
        int dir[] = new int[4];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            switch (c) {
            case 'N':
                dir[0]++;
                break;
            case 'W':
                dir[1]++;
                break;
            case 'S':
                dir[2]++;
                break;
            case 'E':
                dir[3]++;
                break;
            default:
                break;
            }
        }
        boolean ok = true;
        if (dir[0] == 0) {
            if (dir[2] != 0) {
                ok = false;
            }
        }
        if (dir[1] == 0) {
            if (dir[3] != 0) {
                ok = false;
            }
        }
        if (dir[2] == 0) {
            if (dir[0] != 0) {
                ok = false;
            }
        }
        if (dir[3] == 0) {
            if (dir[1] != 0) {
                ok = false;
            }
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
