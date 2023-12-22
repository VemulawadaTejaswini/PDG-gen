import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
       int cash = 1000;
       int count = 1;
        while (cash * count < n) {
            count++;
        }
        
        int payment = cash * count - n;
        System.out.println(payment);
    }
}
            