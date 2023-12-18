import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int W, H, x, y, r, xr, yr;
      Scanner sc = new Scanner(System.in);
       W = sc.nextInt();
       H = sc.nextInt();
       x = sc.nextInt();
       y = sc.nextInt();
       r = sc.nextInt();
      xr = x + r;
      yr = y + r;
     
      if (x<=-1|| y<=-1||xr>W || yr>W|| xr>H||yr>H){
      System.out.println("No");
      }
      else System.out.println("Yes");
    }
    }
    
