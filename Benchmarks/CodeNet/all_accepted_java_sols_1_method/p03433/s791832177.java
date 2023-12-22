import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();

    int ichi = N%500;
    
    if(A>=ichi){
    System.out.println("Yes");        
    }else{
    System.out.println("No");    
    }
  }
}
