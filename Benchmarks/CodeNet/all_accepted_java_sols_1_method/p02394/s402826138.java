import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        
        if((x-r)>=0 && (y-r)>=0 && (x+r)<=W && (y+r)<=H){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
