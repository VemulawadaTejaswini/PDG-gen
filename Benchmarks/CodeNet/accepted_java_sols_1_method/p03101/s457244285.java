import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
      	int h = sc.nextInt();
      	int w = sc.nextInt();
      	int sam = H*W;
        int a = h*W;
        int b = H*w;
        int c = h*w;
        int d = b-c;
          
      System.out.print(sam-(a+d));
      
      

    }
}