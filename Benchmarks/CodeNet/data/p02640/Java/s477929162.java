import java.util.*;

public class Main {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x,y;
    String ans = "No";

    x = scan.nextInt();
    y = scan.nextInt();

    if(y%2 == 0) {
        if((x * 2) <= y && y <= (x * 4)) {
            ans = "Yes";
        }
    }

    System.out.println(ans);
    scan.close();

}

};
