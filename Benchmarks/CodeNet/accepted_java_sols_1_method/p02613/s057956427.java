import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int ac=0,wa=0,tle=0,re=0;
        for(int i=0;i<x;i++)
        {
            String str=sc.next();
            if(str.equals("AC"))
              ac++;
             else if(str.equals("WA"))
              wa++;
             else if(str.equals("TLE"))
              tle++;
             else if(str.equals("RE"))
              re++;
        }
        System.out.println("AC x "+ac);
        System.out.println("WA x "+wa);
        System.out.println("TLE x "+tle);
        System.out.println("RE x "+re);
     }
}