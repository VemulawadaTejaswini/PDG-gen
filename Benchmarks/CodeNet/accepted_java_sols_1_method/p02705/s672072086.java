import java.util.*;

public class Main {
    public static void main(String[] args) {
        double R;


        try (Scanner sc = new Scanner(System.in)) {
            R = sc.nextInt();
        }
        System.out.println(2*Math.PI*R);
    }
}
