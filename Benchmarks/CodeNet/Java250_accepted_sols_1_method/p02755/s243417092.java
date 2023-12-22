import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    for(int i = 0;i <= 1250;i++){
      if(A == Math.floor(i*0.08) && B == Math.floor(i*0.1)){
        System.out.print(i);
        break;
      }else if(i == 1250){
        System.out.print(-1);
      }
    }
  }
}