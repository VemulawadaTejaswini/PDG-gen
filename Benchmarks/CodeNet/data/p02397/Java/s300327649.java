import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        while(x != 0 || y != 0){
            if(x > y) {
                System.out.println(y + " " +x);
            } else {
                System.out.println(x + " " + y);
            }
            x = in.nextInt();
            y = in.nextInt();
        }
        in.close();
    }
}
