import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        ArrayList<Integer> A = new ArrayList<Integer>();
        for (;;) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 && y == 0) {
                for (int i=0; i<A.size(); i=i+2) {
                    System.out.print(A.get(i));
                    System.out.print(" ");
                    System.out.println(A.get(i+1));
                }
                break;
            }
            else {
                if (x > y) {
                    A.add(y);
                    A.add(x);
                }
                else {
                    A.add(x);
                    A.add(y);
                }
            }

        }
    }
}
