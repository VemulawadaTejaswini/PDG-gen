import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c1=0;
        int c2=0;
        int c3=0;
        int c4=0;
            for(int i=0;i<a;i++)
            {
                String s=sc.next();
                if(s.equals("AC"))
                    c1++;
                if(s.equals("WA"))
                    c2++;
                if(s.equals("TLE"))
                    c3++;
                if(s.equals("RE"))
                    c4++;
            }
            System.out.println("AC"+" "+"x" +" "+ c1);
            System.out.println("WA"+" "+"x" + " "+c2);
            System.out.println("TLE"+" "+"x" +" " +c3);
            System.out.println("RE"+" "+"x" + " " +c4);
    }
}
