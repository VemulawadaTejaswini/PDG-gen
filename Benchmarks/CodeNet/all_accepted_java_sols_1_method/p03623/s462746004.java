import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int A = a-x;
    int B = b-x;
    A = Math.abs(A);
    B = Math.abs(B);
      if(A>B){
    System.out.println("B");
      }else{
	System.out.println("A");
      }
}
}
