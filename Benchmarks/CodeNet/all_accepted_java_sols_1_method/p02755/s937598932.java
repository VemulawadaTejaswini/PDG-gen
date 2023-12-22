import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int ans = -1;
    for(int i=1; i<1500; i++){
      int tax8 = (int)(i * 0.08);
      int tax10 = (int)(i * 0.1);
      if(tax8 == A && tax10 == B){
        ans = i;
        break;
      }else if(tax8 > A || tax10 > B){
        break;
      }
    }
    
    System.out.println(ans);
    
  }
}