import java.util.Scanner;
public class Main{
   public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int train = scan.nextInt();
        int taxi = scan.nextInt();
        int restrain = N * train;
        int retaxi = taxi;
        
        if (restrain < retaxi) {
          System.out.println(restrain);
        } else {
          System.out.println(retaxi);
        }
        scan.close();
   }
}