import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int a = A+B;
    int b = A-B;
    int c = A*B;
    
	System.out.println(Math.max(c,Math.max(a,b)));
      }
      }
