import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int[] list = new int[N];
    double ans = 0;
    for(int i = 0; i < N; i++){
      list[i] = sc.nextInt();
      ans += list[i];
    }
    
    double ave = ans / N;
   
    double distance = (double)Math.abs(list[0]-ave);
 
    int answer = 0;
    for(int i = 1; i < list.length; i++){
      double nextDistance = (double)Math.abs(list[i]-ave);
      if(nextDistance < distance){
        answer = i;
        distance = nextDistance;
      }
    }
    
    
    for(int i = 0; i < list.length; i++){
      if((double)Math.abs(list[i]-ave) == distance){
        System.out.println(i);
        break;
      }
    }
  }
}