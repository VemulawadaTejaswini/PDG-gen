
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if(((n-1)%(k-1)) !=0)
            System.out.println(((n-1)/(k-1)) + 1);
        else
            System.out.println(((n-1)/(k-1)));

    }


}