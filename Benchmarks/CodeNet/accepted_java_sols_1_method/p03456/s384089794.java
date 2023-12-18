import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String s = a+b;
    int num = Integer.parseInt(s);
    for(int i = 1; i < 1000; i++){
      int result = (int) Math.pow(i,2);
      if(result == num){
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}