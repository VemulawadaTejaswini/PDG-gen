import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = 0;
    for(int i = 1;i < 10 ;i++){
      for(int j = 1;j < 10 ;j++){
        b = i * j;
        if(a == b){
          System.out.println("Yes");
          System.exit(0);
        }
      }
    }
    System.out.println("No");
  }
}