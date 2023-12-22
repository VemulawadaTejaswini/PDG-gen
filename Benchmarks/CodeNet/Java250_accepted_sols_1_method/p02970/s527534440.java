import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = 0;
    for(int i = 1;;i++){
      c += 2 * b + 1;
      if(a <= c){
        System.out.println(i);
        break;
      }
    }
  }
}