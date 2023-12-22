import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int[] n = new int[4];
    for(int i = 0; i < 6; i++){
      int m = sc.nextInt();
      n[m-1]++;
    }
    
    String ans = "YES";
    if(n[0] == 3 || n[1] == 3 || n[2] == 3 || n[3] == 3){
      ans = "NO";
    }
    
    System.out.println(ans);
  }
}