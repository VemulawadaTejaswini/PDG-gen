import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int[] taste = new int[n];
    
    int sum = 0;
    int min = 0;
    for(int i = 0; i < n; i++){
      taste[i] = l + (i+1) - 1;
      sum += taste[i];
    }
    
    int data = 0;
    int t = 300;
    int near = 0;
    for(int i = 0; i < n; i++){
      data = taste[i];
      int target = Math.abs(data - min);
      if(t > target){
        t = target;
        near = data;
      }
    }
   
    System.out.println(sum - near);
    
  }
}