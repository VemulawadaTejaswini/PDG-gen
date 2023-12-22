import java.util.Scanner;
 
public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    int A = scan.nextInt();
    int result = H/A;
    if(H%A>0){
      result++;
    }
    System.out.println(result);
  }
}