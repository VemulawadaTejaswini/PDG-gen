
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String S = Input.next();
        boolean F = false;
        int V = 0;
        int Max = 0;
        for (int I = 0; I < S.length(); I++) {
            if (S.charAt(I) == 'A' && !F) {
                F = true;
                V++;
            } else if (S.charAt(I) == 'Z' && Max <= V && F) {
                V++;
                Max = V;
            } else if(F){
                V++;
            }
        }
        System.out.println(Max);
    }
}
