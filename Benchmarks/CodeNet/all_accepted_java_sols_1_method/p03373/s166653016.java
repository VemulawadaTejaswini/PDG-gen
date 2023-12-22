import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int price = 0;
    if(a + b > 2*c){
      int min = Math.min(x,y);
      price = 2*c * min;
      if(x >= y && 2*c < a){
        price += 2*c*(x-y);
      }
      else if(x < y && 2*c < b){
        price += 2*c*(y-x);
      }
      else{
        if(x > y){
          price += a*(x-y);
        }
        else{
          price += b*(y-x);
        }
      }
    }
    else{
      price = (a*x)+(b*y);
    }
    System.out.println(price);
  }
}