import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextInt();
        double t = sc.nextInt();
        double s = sc.nextInt();
      
      //f/s <= t 
      if(d/s <= t){
                System.out.println("Yes");
      }else{
                System.out.println("No");
      }


        sc.close();
    }
}