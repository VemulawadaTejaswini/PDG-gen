import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    int addSum = A+B;
    int subSum = A-B;
    int multiSum = A*B;
    
    int result = addSum;
    if (result < subSum){
    	result = subSum;
    }
    
    if(result < multiSum){
    	result = multiSum;
    }
    
    System.out.println(result);
  }
}