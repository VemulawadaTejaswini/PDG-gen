import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String C = sc.next();
        byte[] byteC = C.getBytes();
        byteC[0]++;
        String nextC = new String(byteC);
        
        System.out.println(nextC);
    }
}