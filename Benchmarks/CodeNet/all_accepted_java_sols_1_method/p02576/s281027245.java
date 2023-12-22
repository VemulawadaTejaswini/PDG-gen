import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    
    int ans = 0;
    if (n%x==0){
      ans = (n/x)*t;
    }
    else{
      ans = (n/x+1)*t;
    }
    System.out.println(ans);
  }
}