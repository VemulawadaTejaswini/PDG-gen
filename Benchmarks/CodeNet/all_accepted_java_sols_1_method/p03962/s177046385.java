import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);   
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int ans;
    
    if(a == b && a == c){
      ans = 1;
    }else if(a != b && a != c && b != c){
      ans = 3;
    }else{
      ans = 2;
    }
    
    System.out.println(ans);
  }
}