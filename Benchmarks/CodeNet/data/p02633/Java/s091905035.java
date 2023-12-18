import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int ans = 0;
    for(int i=1;i<361;i++){
      if( i*n % 360 == 0 ){
        ans = i;
        break;
      }
    }
    System.out.print(ans);
  }
}