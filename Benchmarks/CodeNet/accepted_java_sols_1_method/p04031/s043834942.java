import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int total = 0;
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
      total += a[i];
    }
    total *= 10;
    total /= n;
    if(total % 10 < 5){
      total /= 10;
    }else{
      total /= 10;
      total += 1;
    }
    int cost = 0;
    for(int i = 0;i<n;i++){
      int aa = total - a[i];
      aa *= aa;
      cost += aa;
    }
    System.out.println(cost);
  }
}
