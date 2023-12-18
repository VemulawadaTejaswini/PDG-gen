import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int out = (int) (Math.pow(k - 1, n - 1) * k);
        System.out.println(out);
    }
}