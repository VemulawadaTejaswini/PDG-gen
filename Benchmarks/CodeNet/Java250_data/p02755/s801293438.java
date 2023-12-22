import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int ans = -1;
    for(int i=0; i<10000; i++){
      if((int)(i*0.08)==A) {
        if((int)(i*0.1)==B){
        ans = i;
        break;
        }
      }
    }
    System.out.println(ans);
  }
}
    