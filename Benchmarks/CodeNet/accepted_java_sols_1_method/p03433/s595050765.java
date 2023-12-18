import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a = inp.nextInt();
        inp.close();
        if (n % 500 <= a) System.out.println("Yes");
        else System.out.println("No");
    }
}
