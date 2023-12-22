import java.util.*;
public class Main{
  
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int count=0;
    for(int i=1;i<=N;i++){
      String x = Integer.toString(i);
      int length = x.length();
      if(length%2!=0){
        count++;
      }
    }
    System.out.println(count);
    
  }
  
}