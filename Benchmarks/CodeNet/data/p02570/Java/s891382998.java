import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int dis = sc.nextInt();
      double time = sc.nextDouble();
      int speed = sc.nextInt();
      
      double t = dis / speed;
      if(t <= time){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
        
    }
}
