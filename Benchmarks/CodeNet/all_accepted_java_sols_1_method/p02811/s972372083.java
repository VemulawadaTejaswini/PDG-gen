import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Long k = scan.nextLong();
        Long x = scan.nextLong();

        if(500 * k >= x)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
