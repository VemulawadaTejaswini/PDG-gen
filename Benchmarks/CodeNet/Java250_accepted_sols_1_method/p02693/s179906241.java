import java.util.*;
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    while(b % k != 0){
      b = b - 1;
    }
    
    if(b < a){
      System.out.println("NG");
    }else{
      System.out.println("OK");
    }
    sc.close();
  }
}