import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        
        if (K % 2 == 0) {
            System.out.println((K / 2) * (K / 2));
        }
        else {
            System.out.println((int)(Math.ceil(K / 2.0) * (Math.ceil(K / 2.0) - 1)));
        }
        scan.close();
    }
}
