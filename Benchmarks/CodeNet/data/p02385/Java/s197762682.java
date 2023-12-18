
import java.util.*;

class Dice
{
    int  top ;
    int  front;
    int  left;
    int  right;
    int  back;
    int  bottom;
   
     public int getTop()
     {
         return top;
     }     

    public void setTop(int top) {
        this.top = top;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }
    public void south()
    {
        int temp1 = top;
        int temp2 = bottom;
        top = back;
        bottom = front;
        front = temp1;
        back = temp2;
    }
    public void north()   
    {
        int temp1 = bottom;
        int temp2 = top;
        top = front;
        bottom = back;
        front = temp1;
        back = temp2;
    }
    public void east()
    {
        int temp1 = top;
        int temp2 = bottom;
        top = right;
        bottom = left;
        left= temp1;
        right= temp2;
    }
    public void west()
    {
        int temp1 = top;
        int temp2 = bottom;
        top = left;
        bottom = right;
        left= temp2;
        right= temp1;
    }
    public void sright()
    {
        int temp1 = right;
        int temp2 = back;
        int temp3 = front;
        front = left;
        right = temp3;
        left = temp2; 
        back = temp1;
        
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int [6];
        int b[] = new int[6];
        Dice dc1 = new Dice();
        Dice dc2 = new Dice();
        for(int i=0; i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        
        dc1.setTop(a[0]); dc1.setFront(a[1]); dc1.setRight(a[2]); dc1.setLeft(a[3]); dc1.setBack(a[4]); dc1.setBottom(a[5]);
        
        for(int i=0; i<b.length;i++)
        {
            b[i] = sc.nextInt();
        }
        
        dc2.setTop(b[0]); dc2.setFront(b[1]); dc2.setRight(b[2]); dc2.setLeft(b[3]); dc2.setBack(b[4]); dc2.setBottom(b[5]);
         for(int i = 0; i<4; i++)                 //checking top vertical
         {
           if(dc1.getTop()==dc2.getTop()&&dc1.getBottom()==dc2.getBottom())
           {
               break;
           }
           else
           {
               dc2.north();
           }
         }
         for(int i = 0; i<4; i++)                 //checking top horizontal
         {
           if(dc1.getTop()==dc2.getTop()&&dc1.getBottom()==dc2.getBottom())
           {
               break;
           }
           else
           {
               dc2.east();
           }
         }
          
        if(dc1.getTop()!= dc2.getTop())
        {
            System.out.println("No");
                
        }
        if(dc1.getBottom()!= dc2.getBottom())
        {
            System.out.println("No");
        }
 
             if(dc1.getTop()== dc2.getTop()&&dc1.getBottom()==dc2.getBottom())
             {
                 for(int i = 0; i<4; i++)
                 {
                     if(dc1.getFront()==dc2.getFront() && dc1.getBack()==dc2.getBack()&& dc1.getRight()==dc2.getRight()&&dc1.getLeft() ==dc2.getLeft())
                     {
                         System.out.println("Yes");
                         break;
                     }
                     else
                     {
                             dc2.sright();
                             if(i==3)
                             {
                                 System.out.println("No");
                                 break;
                             }
                        }
                     }
            }
     
           
               
       
  
              
}
    }



