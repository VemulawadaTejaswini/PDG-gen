
import java.util.*;

class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int hl = sc.nextInt();
        int hituyou = sc.nextInt();
        
        int a = hituyou / 1000;
        int n = hituyou % 1000;
        
        int hn = hituyou / 500;
        
        int an = Math.min(2 * hl * a, l * a) +  Math.min( (n+999)/1000*l , (n+499)/500*hl );

        System.out.println(an);
    }
}

