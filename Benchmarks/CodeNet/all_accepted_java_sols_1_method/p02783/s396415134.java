import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int a = sc.nextInt();

    int remainder = h % a;
    int x = (int)(h/a);

    if( remainder > 0 ){
      x++;
    }
    
    System.out.println(x);
  }
}
