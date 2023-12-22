import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    boolean b = isPrime(a);
    if(b){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  public static boolean isPrime(int a){
    for(int i=1;i<10;i++){
      if(a%i==0&&a/i<10){
        return true;
      }
    }
    return false;
  }
}
