import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String ans;
    
    if(a==b) ans = "Draw";
    else if((a<b&&a!=1)||b==1) ans = "Bob";
    else ans = "Alice";
    System.out.println(ans);
    
  }
}