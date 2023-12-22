import java.util.Scanner;
public class Main{
  public static void main(String[]args){

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int m;

    if(b>=1 && b<=a && a<=20 && 1<=c && c<=20){
      m = c-(a-b);
      if(m>=0){
        System.out.println(m);
      }else{
        System.out.println(0);
      }
    }
  }
}
