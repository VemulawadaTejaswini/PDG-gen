import java.util.*;

class main
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int h1,h2,m1,m2,k;
        
        h1=sc.nextInt();
        m1=sc.nextInt();
        h2=sc.nextInt();
        m2=sc.nextInt();
        k=sc.nextInt();
        
        int s=h1*60+m1;
        int g=h2*60+m2;
        
        int result=g-s-k;
        
        System.out.print(result);
    }
}    