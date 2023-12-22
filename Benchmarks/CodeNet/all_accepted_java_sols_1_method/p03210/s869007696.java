import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int X = Integer.parseInt(scan.next());

        if( X == 3 ||  X == 5 ||  X == 7) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
