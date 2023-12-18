import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3=0, y3=0, x4=0, y4=0;
        
        System.out.print(x2-(y2-y1)+" ");
        System.out.print(y2+(x2-x1)+" ");
        System.out.print(x1-(y2-y1)+" ");
        System.out.println(y1+(x2-x1));      
    }
}