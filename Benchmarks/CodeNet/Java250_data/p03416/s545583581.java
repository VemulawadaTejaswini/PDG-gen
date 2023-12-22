import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String A = Input.next();
        String B = Input.next();
        int Count = 0;
        for (int I = Integer.parseInt(A); I <= Integer.parseInt(B); I++) {
            String J = I + "";
            if (J.charAt(0) == J.charAt(4) && J.charAt(1) == J.charAt(3)) {Count++;}}System.out.println(Count);}}