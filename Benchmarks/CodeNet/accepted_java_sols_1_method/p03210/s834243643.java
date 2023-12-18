import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    
    if(n == 3 || n == 5 || n == 7){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}