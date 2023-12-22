import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.next());
    int[] a = new int[num];
    String ans = "YES";
    for (int i = 0; i<num; i++){
      a[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(a);
    for (int j = 1;j<num; j++){
      if(a[j-1] == a[j]){
        ans = "NO";
        break;
      }
    }
    System.out.println(ans);
  }
}