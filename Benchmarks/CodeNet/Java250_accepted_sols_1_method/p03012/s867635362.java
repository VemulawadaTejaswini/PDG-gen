import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d;
    int sum = 0;
    int abssum ;
    int[] array = new int[n];
    for(int i=0; i<n; i++){
      d = sc.nextInt();
      sum += d;
      array[i] = d;
    }
    abssum = sum;
    for(int i=0; i<n; i++){
      sum = sum - 2 * array[i];
      if(sum<0){
        if(abssum<Math.abs(sum)){
          System.out.println(abssum);
          break;
        }else{
          System.out.println(Math.abs(sum));
          break;
        }
      }
      abssum = Math.abs(sum);
    }
  }
}