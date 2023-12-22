import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    for(int i = 1;i<1001;i++){
      int tmp = k * i;
      if(a <= tmp && tmp <= b){
        System.out.println("OK");
        return;
      }
    }
    System.out.println("NG");
  }
}
