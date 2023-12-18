import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int w,h,x,y,r;
        w = scan.nextInt(); h=scan.nextInt(); x=scan.nextInt(); y=scan.nextInt(); r=scan.nextInt();
          int rxLeft = x-r;
        int rxRight = x+r;
        int ryTop = y+r;
        int ryBot = y-r;
          if ((w >= rxRight) &&(h>=ryTop) && rxLeft >=0 && ryBot >=0) {       
           System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
