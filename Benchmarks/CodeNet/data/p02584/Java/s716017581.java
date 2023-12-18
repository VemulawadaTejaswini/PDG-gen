import java.util.Scanner;

public class Main{
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       long pos,steps,dis;
       pos = s.nextLong();
       steps = s.nextLong();
       dis = s.nextLong();
       
       if(pos<0)
       {
           pos=-pos;
       }
       if( steps<= (pos/dis) ){
            steps = (pos/dis)-steps;
            
            System.out.println(steps*dis);
       }
       else
       {
           long temp=pos;
           pos=(pos%dis);
           steps= steps- (temp/dis);
           if(steps%2==0)
           {
               System.out.println(pos);
           }
           else
           {
               System.out.println(Math.min(Math.abs(pos-dis), Math.abs(pos+dis) ));
           }
       }
    
    }
}