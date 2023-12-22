import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        long x = sc.nextInt();
        
        long power1000 = 0;
        long power5 = 0;
        
        power1000 = x/500;
        power5 = (x%500)/5;
        
        System.out.println(1000*power1000+5*power5);
    }
}