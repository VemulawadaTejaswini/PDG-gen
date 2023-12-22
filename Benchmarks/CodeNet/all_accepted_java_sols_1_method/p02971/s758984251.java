import java.util.*;

public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int largest = Integer.MIN_VALUE;
    int second =  Integer.MIN_VALUE;
    int[] arr = new int[n];
    int val;
    for (int i=0; i<n;i++){
      val = sc.nextInt();
      arr[i] = val;
      if (val > largest){
        second = largest;
        largest = val;
        
      } else if (second < val) {
        second = val;
      }
      
    }
    for (int num:arr){
      if (num == largest){
        System.out.println(second);
    } else{ System.out.println(largest);}
                           }
  }
}