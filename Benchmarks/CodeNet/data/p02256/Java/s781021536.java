import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    while(true){
    if(a%b==0){
      System.out.println(b);
      break;
    }
      a%=b;
      if(b%a==0){
        System.out.println(a);
        break;
      }
      b%=a;
    }
     sc.close();
  }
}
