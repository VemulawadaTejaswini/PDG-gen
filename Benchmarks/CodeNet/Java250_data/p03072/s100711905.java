import java.util.*;
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int[] h = new int[a];
    int minIndex=0;
    int sum=0;
    
    for(int i=0;i<a;i++){
      h[i] = sc.nextInt();
    }
    
    for(int i=0;i<a;i++){
      if(h[minIndex] <= h[i]){
        sum+=1;
        minIndex = i;
      }
    }
    System.out.println(sum);
  }
}
    