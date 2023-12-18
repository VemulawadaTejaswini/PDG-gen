import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B =  sc.nextInt();
    int C=sc.nextInt();
    int count= 0;
    for(int i=1;i<=C;i++){
      if(A*i<=B){
      count++;
      }
    }
    System.out.println(count);
  }
}