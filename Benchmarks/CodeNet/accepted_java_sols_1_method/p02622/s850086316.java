import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(),b = sc.next();
        int count = 0;
        char[] A = a.toCharArray(),B = b.toCharArray();
        for (int i = 0; i <A.length ; i++) {
            if(A[i] == B[i])count++;
        }
        System.out.println(a.length() - count);

    }
}
