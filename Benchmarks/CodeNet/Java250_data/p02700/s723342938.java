import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    int D = scanner.nextInt();
    
    System.out.println(cal(A,D) >= cal(C,B) ? "Yes" : "No");
  }
  
  private static int cal(int a,int b){
    int i;
    for(i = 0;a - b > 0;i++){
      a = a - b;
    }
    return i;
  }
}