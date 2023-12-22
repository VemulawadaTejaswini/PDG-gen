import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        B();
    }
 
    public static void B() throws Exception {
        Scanner scanner = new Scanner( System.in );
        String S = scanner.next();
        boolean inACGT = false;
        int start = 0, len = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt( i );
            boolean isACGT = c == 'A' || c == 'C' || c == 'G' || c == 'T';
            if (inACGT) {
                if (!isACGT) {
                    inACGT = false;
                    len = Math.max( len, i - start);
                }
            } else {
                if (isACGT) {
                    inACGT = true;
                    start = i;
                }
            }
        }
        if (inACGT) len = Math.max( len, S.length() - start);
        System.out.println(len);
    }
 
}