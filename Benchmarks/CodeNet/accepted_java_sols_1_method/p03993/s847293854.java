import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i=0;i<n;i++){
      a[i] = sc.nextInt()-1;
    }
    int ans = 0;
    for (int i=0;i<n;i++){
      if (i == a[a[i]]){
        ans +=1;
      }
    }
    System.out.println(ans/2);
  }
}