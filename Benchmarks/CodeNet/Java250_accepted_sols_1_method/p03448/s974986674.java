import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.nextLine());
    int B = Integer.parseInt(sc.nextLine());
    int C = Integer.parseInt(sc.nextLine());
    int X = Integer.parseInt(sc.nextLine());
    
    int ans = 0;
    for(int i = 0; i <= A; i++){
      for(int j = 0; j <= B; j++){
        int z = i*500+j*100;
        if(z > X){
          continue;
        }
        if((X-z)/50 <= C){
          ans++;
        }
      }
    }
    
    System.out.println(ans);
  }
}