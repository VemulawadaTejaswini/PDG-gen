
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        long a= sc.nextLong();
        double k = Math.sqrt(a);
        long r = (long)k;
        if(k-r==0)
        {
            System.out.println(a);
        }
        else
        {
            long p =a-1;
            while(true)
            {
                k=Math.sqrt(p--);
                r=(long)k;
                if(k-r==0)
                {
                    System.out.println(p+1);
                    return;
                }
            }
        }


    }
}
