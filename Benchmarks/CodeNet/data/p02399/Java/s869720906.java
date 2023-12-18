import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        double a = in.nextDouble(), b = in.nextDouble();

        System.out.printf("%d %d %f\n", (int)(a/b), (int)(a%b), a/b);
    }
}
