import java.util.*;
 
public class Main{
  public static void main(String...args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt(); int[] x = new int[n];
    int max = 0, min = 0;
    for(int i = 0;i < n;i++){
      x[i] = s.nextInt();
      if(i == 0 || x[i] < min){ min = x[i]; }
      if(i == 0 || x[i] > max){ max = x[i]; }
    }
    int minv = 0;
    for(int i = min;i < max;i++){
      int tmp = 0;
      for(int j = 0;j < n;j++){
        tmp+=(x[j]-i)*(x[j]-i);
      }
      if(i == min || tmp < minv){minv = tmp;}
    }
    System.out.println(minv);
  }
}