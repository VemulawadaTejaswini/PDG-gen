import java.util.*;
public class Main{
    public static void main(String[] args){
        int x,y,temp;
        Scanner sc=new Scanner(System.in);
        while(true){
            x=sc.nextInt();
            y=sc.nextInt();
            if (x==0 && y==0) break;
            else if (x > y){
                temp=x;
                x=y;
                y=temp;
               System.out.printf("%d %d\n",x,y);
            }
            else System.out.printf("%d %d\n",x,y);
            
        }
    }
}
