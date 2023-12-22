import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] voteList = new int[n];
    int totalV = 0;
    int chose = 0;
    String ans = "No";
    
    for (int i = 0; i < n; i++){
      int a = sc.nextInt();
      totalV += a;
      voteList[i] = a;
    }
    
    int min = totalV/(4*m);
    
    if (totalV%(4*m) > 0){
      min++;
    }
    
    for (int i = 0; i < n; i++){
      if (voteList[i] >= min){
        chose++;
      }
      if (chose >= m){
        ans = "Yes";
        break;
      }
    }
    
    System.out.println(ans);
  }
}