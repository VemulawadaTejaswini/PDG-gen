import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double dis = sc.nextDouble();
      double time = sc.nextDouble();
      double speed = sc.nextDouble();
      
      double t = dis / speed;
      if(t <= time){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
        
    }
}
