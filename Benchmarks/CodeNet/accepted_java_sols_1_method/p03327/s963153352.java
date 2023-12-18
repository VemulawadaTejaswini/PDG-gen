import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        if (a < 1000) System.out.println("ABC");
        else System.out.println("ABD");
        inp.close();
    }
}
