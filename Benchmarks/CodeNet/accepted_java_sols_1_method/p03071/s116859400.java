import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int x = 0;
    int i = 0;
    do{
      if(a > b)
        x += a--;
      else
        x += b--;
      i++;
    }while(i != 2);
      
    System.out.println(x);
  }
}