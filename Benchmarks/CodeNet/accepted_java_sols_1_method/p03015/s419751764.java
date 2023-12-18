import java.util.*;

public class Main {
    static long steps[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String L = sc.next();
        long ari = 1L;
        long nasi = 2L;
        for(int i=1; i<L.length(); i++) {
            ari = (ari * 3) % 1000000007L;
            switch(L.charAt(i)) {
                case '0':
                    break;
                case '1':
                    ari = (ari + nasi) % 1000000007L;
                    nasi = (nasi * 2) % 1000000007L;
                    break;
            }
        }
        System.out.println((ari + nasi) % 1000000007L);
    }
}