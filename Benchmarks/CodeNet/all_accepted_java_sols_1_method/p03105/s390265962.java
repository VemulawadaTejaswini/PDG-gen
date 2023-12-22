import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int count = 0;
    for(int i = 0;i < C;i++){
      if(B >= A){
        B-=A;
        count++;
      }else{
        break;
      }
    }
    
    System.out.println(count);
  }
}
