import java.util.Scanner;

public class Main{
  
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] tokens = scanner.nextLine().split(" +");
    
    int A = Integer.parseInt(tokens[0]);
    int B = Integer.parseInt(tokens[1]);
    int C = Integer.parseInt(tokens[2]);
    int D = Integer.parseInt(tokens[3]);
    
    System.out.println(Math.max(A*B, C*D));
  }
}