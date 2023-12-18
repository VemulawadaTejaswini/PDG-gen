import java.util.*;

public class Grading{
  public static void Main(String[] args){

    Scanner sc = new Scanner(System.in);

    while(true){
      int m = sc.nextInt();
      int f = sc.nextInt();
      int r = sc.nextInt();

      int sum = m + f;

      if(sum >= 80){
        System.out.println("A");
      }else if(sum >= 65 && sum < 80){
        System.out.println("B");
      }else if(sum >= 50 && sum < 65){
        System.out.println("C");
      }else if(sum >= 30 && sum < 50 && r < 50){
        System.out.println("D");
      }else if(sum >= 30 && sum < 50 && r >= 50){
        System.out.println("C");
      }else if(sum < 30 && m >=0 && f >= 0){
        System.out.println("F");
      }else if(m == -1 && f == -1 && r == -1){
        return;
      }else{
        System.out.println("F");
      }
    }
  }
}

