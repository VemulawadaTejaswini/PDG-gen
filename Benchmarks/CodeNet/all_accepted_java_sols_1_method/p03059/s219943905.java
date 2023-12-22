import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int T = scanner.nextInt();
    
    
    int sumA = A;
    int sumB = 0;
    
    while(sumA <= T){
    
      sumA += A;
      sumB += B;
    }
    
    System.out.println(sumB);
    
  }
}
