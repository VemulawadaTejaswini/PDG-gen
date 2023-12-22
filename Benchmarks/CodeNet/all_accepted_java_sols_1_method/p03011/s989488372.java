import java.util.Scanner;

public class Main {
    private static final Scanner  SC = new Scanner(System.in);
    private static final int P = SC.nextInt();
    private static final int Q = SC.nextInt();
    private static final int R = SC.nextInt();
    
    public static void main(String[] args) {
        int min = P+Q+R;
        int[] p = {P+Q,Q+R,R+P};
        for(int i:p){
            min = Math.min(min,i);
        }
        System.out.println(min);
    }
}