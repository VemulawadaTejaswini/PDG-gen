import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int n = sc.nextInt();
    if(d == 0){
      if(n != 100){
        System.out.println(n);
      }else{
        System.out.println(n+1);
      }
    }
    if(d == 1){
      if(n != 100){
        System.out.println(n*100);
      }else{
        System.out.println((n+1)*100);
      }
    }
    if(d == 2){
      if(n != 100){
        System.out.println(n*10000);
      }else{
        System.out.println((n+1)*10000);
      }
    }
  }
}
