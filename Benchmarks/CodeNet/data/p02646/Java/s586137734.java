import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A=sc.nextInt();
    int V=sc.nextInt();
    int B=sc.nextInt();
    int W=sc.nextInt();
    int T=sc.nextInt();
    int X=Math.abs(B-A);
    int sp=V-W;
    int Z=sp*T-X;
    if(Z<0) {
    	System.out.println("NO");
    }else {
    	System.out.println("YES");
    }
  }
}
  