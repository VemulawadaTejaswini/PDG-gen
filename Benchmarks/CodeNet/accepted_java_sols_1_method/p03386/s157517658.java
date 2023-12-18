import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next())-1;
    
    for(int i= A; i <= B; i++){
      if((i <= A+K && i >= A) || (i >= B-K && i <= B)){
        System.out.println(i);
      }
    }
  }
}