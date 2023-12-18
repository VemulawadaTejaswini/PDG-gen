import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int cnt = x / 100;
    int rem = x % 100;
    
    if(cnt*5 < rem){
      System.out.println(0);
    }else{
      System.out.println(1);
    }
    
  }
}
