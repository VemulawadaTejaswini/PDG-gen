import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    String ans;
    
    if((a==b&&b==c)||(a!=b&&b!=c&&c!=a)) ans = "No";
    else ans = "Yes";


    System.out.println(ans);
    
  }
}