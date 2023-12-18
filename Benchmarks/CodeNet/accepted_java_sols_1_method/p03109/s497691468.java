import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String a = inp.next();
        String b = a.substring(5, 7);
        int n = Integer.parseInt(b);
        if (n > 4) System.out.println("TBD");
        else System.out.println("Heisei");
        inp.close();
    }
}
