import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B=s.nextInt();
        int C=Math.max((A+B),(A-B));

        System.out.print(Math.max(C,(A*B)));
        }
    }
