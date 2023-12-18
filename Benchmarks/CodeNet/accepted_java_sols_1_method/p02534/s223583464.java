import java.util.Scanner;

public class Main{
  public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    
    String str = "ACL";
    for(int i=0; i<k; i++){
      System.out.print(str);
    }
  }
}