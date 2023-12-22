import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int A = sc.nextInt();
 
    int N = H/A;
    int n = H%A;
      if(n==0){
	System.out.println(N);
      }else{
    System.out.println(N+1);
      }
      }
}

