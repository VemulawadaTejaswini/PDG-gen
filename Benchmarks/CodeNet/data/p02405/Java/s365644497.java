import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
           int H = sc.nextInt(); 
           int W = sc.nextInt();
           if(H == 0 &&  W==0)
           {
               break;
           }
           int cnt =0;
           for (int i = 0; i < H; i++) {
              for (int j = 0; j < W; j++) {
                if(cnt %2 ==0)
                {
                    System.out.print("#");
                }
                else{
                    System.out.print(".");
                }
                cnt ++;
              } 
              System.out.println();
           }
           System.out.println();
        }
        sc.close();
    }
}
