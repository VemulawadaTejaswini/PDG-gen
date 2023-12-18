import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int W=0, H=0, x=0, y=0, r=0;
        
        W=scan.nextInt();
        H=scan.nextInt();
        x=scan.nextInt();
        y=scan.nextInt();
        r=scan.nextInt();
        
        if(0<=x-r&&x+r<=W&&0<=y-r&&y+r<=H)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
