import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int max1 = 0;
    int max2 = 0;
    int[] num = new int[N];
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(sc.nextLine());
      if(num[i] > max1){
        max1 = num[i];
      }else if(num[i] > max2){
        max2 = num[i];
      }
    }
    
    int ans = 0;
    for(int i = 0; i < N; i++){
      if(max1 == max2){
        ans = max1;
      }else{
        if(num[i] == max1){
          ans = max2;
        }else{
          ans = max1;
        }
      }
      System.out.println(ans);
    }
  }
}