import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    double min = Math.pow(10,10);
    double max = 0;
    for(int i=0; i<n; i++){
      double target = sc.nextInt();
      if(min > target){
         min = target;
      }
      if(max < target){
        max = target;
      }
    }
    System.out.println((int)(max - min) );
  }
}
