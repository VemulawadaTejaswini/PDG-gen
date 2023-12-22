import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        String N = scan.next();

        if(N.equals("Sunny"))
            System.out.println("Cloudy");
        else if(N.equals("Cloudy"))
            System.out.println("Rainy");
        else
            System.out.println("Sunny");
    }
}
