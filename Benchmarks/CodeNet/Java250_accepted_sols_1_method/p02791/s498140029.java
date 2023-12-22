import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int[] p = new int[n];
    int count = 0;
  for (int i = 0; i < n; i++){
    p[i] = Integer.parseInt(sc.next());
  }
  int arrayMin = Integer.MAX_VALUE;
  for (int i = 0; i < n; i++){
    arrayMin = Math.min(p[i],arrayMin);
    if(arrayMin == p[i]){
            count++;
    }
  }
  System.out.println(count);
  }
}
