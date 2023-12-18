import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int n = b/k+1;
    int m = a/k;
    boolean f = false;
    for(int i=m; i<n; i++){
      if(a<=k*i && k*i<=b){
        f = true;
        break;
      }
    }
    
    if(f==true){
      System.out.println("OK");
    }
    else{
      System.out.println("NG");
    }
  }
}