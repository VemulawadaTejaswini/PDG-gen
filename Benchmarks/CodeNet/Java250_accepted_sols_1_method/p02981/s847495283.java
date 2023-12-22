import java.util.*;
 
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    
    int total = N * A;
    
    if (total > B) {
      total = B;
    }
  	
    System.out.print(total);
	}
}