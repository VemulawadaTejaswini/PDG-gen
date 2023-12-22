import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int add = A+B;
    int sub = A-B;
    int mul = A*B;
    int answer=-1000000;
    answer = Math.max(Math.max(add,sub),mul);
    System.out.println(answer);
    
  }
  

  
}