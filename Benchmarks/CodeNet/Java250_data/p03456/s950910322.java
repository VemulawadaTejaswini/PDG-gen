
import java.util.*;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Main {

    int V;
    String S;

    Main(String S, int V) {
        this.S = S;
        this.V = V;
    }

    public String toString() {
        return S + " " + V;
    }

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        String A = Input.next();
        String B = Input.next();

        int C = Integer.parseInt(A + B);

        int N = 1;
        boolean F = false;
        while (N <= C) {
            if (N * N == C) {
                F = true;
                break;
            }
            N++;
        }
        if (F) {
            System.out.println("Yes");
        }else{System.out.println("No");}
    }
}
