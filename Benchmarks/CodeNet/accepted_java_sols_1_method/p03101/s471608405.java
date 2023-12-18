import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int hh = sc.nextInt();
        int ww = sc.nextInt();
        int sum = h*w;

        System.out.println(sum-(h*ww)-(w*hh)+(hh*ww));
        

        
    }

}
