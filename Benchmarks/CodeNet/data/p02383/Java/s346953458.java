
import java.util.*;

class Dice
{
      String  top = "top";
      String  front = "front";
      String  left = "left";
      String  right= "right";
      String  back = "back";
      String  bottom = "bottom";
     void Dice()
     {
        
     }
     public String getTop()
     {
         return top;
     }
     public int proper(String a)
     { 
         if(a.compareTo("top")==0)
         {
             return 0;
         }
         if(a.compareTo("bottom")==0)
         {
             return 5;
         }
          if(a.compareTo("front")==0)
         {
             return 1;
         }
           if(a.compareTo("back")==0)
         {
             return 4;
         }
            if(a.compareTo("left")==0)
         {
             return 2;
         }
             if(a.compareTo("right")==0)
         {
             return 3;
         }
             return 0;
     }

    public void south()
    {
         String temp1 = top;
        String temp2 = bottom;
        top = back;
        bottom = front;
        front = temp1;
        back = temp2;
        
       
    }
    public void north()   //{"top", "front", "left", "right", "back", "bottom"};
    {
        String temp1 = bottom;
        String temp2 = top;
        top = front;
        bottom = back;
        front = temp1;
        back = temp2;
    }
    public void east()
    {
        String temp1 = top;
        String temp2 = bottom;
        top = right;
        bottom = left;
        left= temp1;
        right= temp2;
    }
    public void west()
    {
        String temp1 = top;
        String temp2 = bottom;
        top = left;
        bottom = right;
        left= temp2;
        right= temp1;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String [] arr = new String [6];
        
        for(int i = 0; i<6; i++)
        {
           arr[i] = sc.next();
        }
        String cmd = sc.next();
        char ch [] = cmd.toCharArray();
        Dice dc = new Dice();
       
        for(int i = 0; i<ch.length;i++)
        {
            switch(ch[i])
            {
                case 'S':
                dc.south();
                break;    
                
                case 'W':
                dc.west();
                break;    
                
                case 'N':
                dc.north();
                break;    
                
                case 'E':
                dc.east();
                break;    
            }
        }
        System.out.println(arr[dc.proper(dc.getTop())]);
    }
}


