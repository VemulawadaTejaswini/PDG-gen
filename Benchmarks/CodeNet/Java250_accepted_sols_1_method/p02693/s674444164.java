import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int k = scan.nextInt();
    int a = scan.nextInt();
    int b = scan.nextInt();
    int flag = 0;
    for (int i = a; i <=b; i++){
      if (i%k==0){
        flag++;
        System.out.println("OK");
        break;
      }
    }
    if (flag == 0){
      System.out.println("NG");
    }
  }
}