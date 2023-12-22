import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int l = sc.nextInt();
    String ans = "YES";
    int[] list = new int[l];
    
    for(int i = 0; i < l; i++){
      list[i] = sc.nextInt();
    }
    
    Arrays.sort(list);
    
    for(int i = 0; i < l-1 ; i++){
      if(list[i]==list[i+1]){
        ans = "NO";
        break;
      }
    }
    
    System.out.println(ans);
    
  }
}