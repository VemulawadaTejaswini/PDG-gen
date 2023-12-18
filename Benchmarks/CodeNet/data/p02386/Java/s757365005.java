
import java.util.*;

class Dice
{
    int  top ;int  front;int  left;int  right;int  back;int  bottom;
    public void Setter(int top, int front, int right, int left, int back, int bottom)
    {
        this.top = top;
        this.front = front;
        this.right = right;
        this.left = left;
        this.back = back;
        this.bottom = bottom;
    }
 
     public int getTop()
     {
         return top;
     }     
    public int getFront() {
        return front;
    }
    public int getLeft() {
        return left;
    }
    public int getRight() {
        return right;
    }
    public int getBack() {
        return back;
    }
    public int getBottom() {
        return bottom;
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
        top = left;
        bottom = right;
        left= temp2;
        right= temp1;
    }
    public void spinR()
    {
        int temp1 = right;
        int temp2 = back;
        int temp3 = front;
        front = left;
        right = temp3;
        left = temp2; 
        back = temp1;
    }
     public Boolean Checker(Dice a, Dice b)
     {
         while(true)
         {
            for(int i = 0; i<4; i++)
            {
              if(a.getTop()!=b.getTop() || a.getBottom()!=b.getBottom())
                {
                     b.north();
                }
              else
              {
                  break;
              }
            }
            for(int j = 0;j<4;j++)
            {
                if(a.getTop()!=b.getTop() || a.getBottom()!=b.getBottom())
                {
                    b.east();
                }
                else break;
            }
            if(a.getTop()!=b.getTop() || a.getBottom()!=b.getBottom())
            {
               return true;
            }
            else
            {
                for(int i = 0; i<4; i++)
                {
                     if(a.getFront()!=b.getFront() ||a.getRight()!=b.getRight() ||a.getBack()!=b.getBack() ||a.getLeft()!=b.getLeft() || a.getBottom()!=b.getBottom())
                    {
                        b.spinR();
                    }
                     else break;
                 }
               if(a.getFront()!=b.getFront() ||a.getRight()!=b.getRight()||a.getLeft()!=b.getLeft() ||a.getBack()!=b.getBack() || a.getBottom()!=b.getBottom())
               {
                   return true;
               }
               else return false;
            }
         }
     }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][6];
        Dice dc[] = new Dice[n];
        for(int i = 0; i < n; i++)  //inserting
        {
            dc[i] = new Dice();
            for(int j=0; j<6; j++)arr [i][j]=sc.nextInt();
        }
        for(int i = 0; i<n; i++) dc[i].Setter(arr[i][0],arr[i][1],arr[i][2],arr[i][3],arr[i][4],arr[i][5]);
        int ct = 0;
        for(int i = 0; i < n-1; i++)  
        {
            if(ct<0) break;
            for(int j =1; j<n;j++)
            {
                if(i ==j)break;
                 if(dc[0].Checker(dc[i], dc[j])==false)
                 {
                    System.out.println("No");
                    ct = -9999999;
                    break;
                 }
                       
            }
        }
        if(ct==0)System.out.println("Yes");
    }
}   



