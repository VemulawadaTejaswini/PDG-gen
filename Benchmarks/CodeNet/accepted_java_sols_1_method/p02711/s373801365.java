
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    for(int i=0;i<3;i++){
      if(N%10==7||N/100==7||(N/10)%10==7){
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
    


  
}
