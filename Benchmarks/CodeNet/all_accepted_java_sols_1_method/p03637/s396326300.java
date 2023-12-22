import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[3];
    for(int i = 0; i < n; i++){
      int tmp = sc.nextInt();
      if(tmp % 4 == 0){
        a[2]++;
      }else if(tmp % 2 == 0){
        a[1]++;
      }else{
        a[0]++;
      }
    }
    if(a[0] <= a[2] || (a[0] == a[2]+1 && a[1] == 0)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
