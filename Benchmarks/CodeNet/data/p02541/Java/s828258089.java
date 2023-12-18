import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc =new Scanner (System.in);
        double k=sc.nextDouble();
        double a=0;
        for(double i=1;i<k;i++)
        {
            a=a+i;
            // System.out.println(a);
            if(a%k==0)
            {
                // System.out.println(a);
                break;
            }
        }
        System.out.println(a);
	}
}