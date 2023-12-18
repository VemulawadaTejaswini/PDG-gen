import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean[] rate = new boolean[8];
    int maxCount = 0;
    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      int a = sc.nextInt();
      if(a >= 3200){
        maxCount++;
      }else{
        rate[a/400] = true;
      }
    }
    int min = 0;
    for(int i = 0; i < 8; i++){
      if(rate[i]) min++;
    }
    if(min == 0){
      min = 1;
      maxCount--;
    }
    System.out.println(min + " " + (min + maxCount));
  }
}
