import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int taste = 0;
    int sum =0;
    if(l+n-1 < 0){
      taste = l+n-1;
    } else if(l > 0){
      taste = l;
    } else {
      taste = 0; 
    }
    for(int i=1;i<=n;i++){
      sum +=l+i-1;
    }
    System.out.println(sum-taste);
  }
}
