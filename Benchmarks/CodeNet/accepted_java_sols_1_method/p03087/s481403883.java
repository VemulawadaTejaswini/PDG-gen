import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int count = 0;
    int[] a = new int[n];
    int[] ans = new int[q];
    for(int i = 1;i < n;i++){
      if(s.charAt(i-1) == 'A' && s.charAt(i) == 'C'){
        count++;
        a[i] = count;
      }
      else{
        a[i] = count;
      }
    }
    for(int i = 0;i < q;i++){
      int l = sc.nextInt();
      int r = sc.nextInt();
      ans[i] = a[r-1] - a[l-1];
    }
    for(int i = 0;i < q;i++){
      System.out.println(ans[i]);
    }
  }
}
