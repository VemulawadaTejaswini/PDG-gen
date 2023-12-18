import java.util.*;

public class Main {

    public static void main(String args[])  {


        Scanner scan = new Scanner(System.in);

        int l = scan.nextInt();
        int r = scan.nextInt();
        int d = scan.nextInt();

        int a = l / d;
        int b = r / d;
        

        if ( l % d== 0 && r % d == 0) {
            System.out.println(b - a + 1);
            
        } else {
            System.out.println(b - a);
            
        }
        
    }


}