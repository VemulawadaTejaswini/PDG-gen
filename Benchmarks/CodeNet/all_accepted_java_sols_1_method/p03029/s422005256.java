import java.util.*;

class Main
{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int p = sc.nextInt();
        
        int total = a * 3 + p;
        
        int pie = total / 2;
        
        System.out.println(pie);
        
    }
}