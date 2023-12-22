import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        boolean flag = false;
        if (a == 5 && b == 5 && c == 7) flag = true;
        if (a == 5 && b == 7 && c == 5) flag = true;
        if (a == 7 && b == 5 && c == 5) flag = true;
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}