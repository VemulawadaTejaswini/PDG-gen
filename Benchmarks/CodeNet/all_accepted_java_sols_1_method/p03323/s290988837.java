import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        boolean ans = Math.max(a, b) <= 8;
        System.out.println(ans ? "Yay!" : ":(");
        inp.close();
    }
}
