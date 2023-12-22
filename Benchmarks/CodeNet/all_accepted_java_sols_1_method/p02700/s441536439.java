import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    for(int i=0 ; i<=300 ; i++){
      if(i%2==0){
        if(c-b<=0){
          System.out.println("Yes");
          break;
        }else{
          c = c-b;
        }
      }else{
        if(a-d<=0){
          System.out.println("No");
          break;
        }else{
          a = a-d;
        }
      }

    }
  }
}
