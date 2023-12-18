import java.util.Scanner;

public class Main{
  static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    while(sc.next()){
      a *= sc.nextInt();
    }
    
    if(a > (10^18)){
      System.out.print(-1);
    }else{
      System.out.print(a);
    }
  }
}