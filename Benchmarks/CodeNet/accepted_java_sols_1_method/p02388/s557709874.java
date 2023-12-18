import java.util.*;

class Main{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = x;
    for(int i = 0; i < 2; i++){
       x *= y;
    }
  System.out.println(x);
  sc.close();
  }
}