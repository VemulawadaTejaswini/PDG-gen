import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if (n == 1) {
            System.out.println("Hello World");
        }
        else {
            int a = inp.nextInt();
            int b = inp.nextInt();
            System.out.println(a + b);
        }
        inp.close();
    }
}
