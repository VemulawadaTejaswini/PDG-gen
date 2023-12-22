import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt()+sc.nextInt();
        int right = sc.nextInt()+sc.nextInt();
        if(left>right) System.out.println("Left");
        else if(right>left) System.out.println("Right");
        else System.out.println("Balanced");


    }
}
