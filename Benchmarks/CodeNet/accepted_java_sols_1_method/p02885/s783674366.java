import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int total =B*2;
    if(B>=A){
    	System.out.println(0);
    }else if(A<=total){
    	System.out.println(0);
    }else{
    	System.out.println(A-total);
    }
  }
}
