import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        inp.close();
        String[] ss = s.split(",", 0);
        for (int i = 0; i < 3; i++) {
            System.out.print(ss[i] + " ");
        }
        System.out.println();
    }
}