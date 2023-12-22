import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        int[] M = new int[2];
        int[] D = new int[2];
        for (int i=0; i<2; i++) {
            M[i] =  Integer.parseInt(sc.next());
            D[i] =  Integer.parseInt(sc.next());
        }
        sc.close();

        if (M[0]!=M[1])
            System.out.println("1");
        else
            System.out.println("0");
    }
}