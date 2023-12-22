import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),m = sc.nextInt();
    int a[] = new int[m],b[] = new int[m];
    for(int i = 0;i<m;i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    int count[] = new int[n];
    int num = 0;
    for(int i = 0;i<m;i++){
      num = a[i] - 1;
      count[num]++;
      num = b[i] - 1;
      count[num]++;
    }
    for(int i = 0;i<n;i++){
      System.out.println(count[i]);
    }
  }
}
