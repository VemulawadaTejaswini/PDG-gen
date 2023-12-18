import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    int A = Integer.parseInt(scanner.next());
    int B = Integer.parseInt(scanner.next());
    
    if(N*A<B){
      System.out.println(N*A);
    }else{
      System.out.println(B);
    }
  }
}