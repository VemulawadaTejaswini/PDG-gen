import java.util.*;
 
class Main{
  	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int V = sc.nextInt();
      int B = sc.nextInt();
      int W = sc.nextInt();
      int T = sc.nextInt();
      //System.out.print(A+""+V+""+B+""+W+""+T);
      V *= T;
      W *= T;
      if(A<B){
        A += V;
        B += W;
        if(A>=B){
          System.out.print("YES");
        }else{
          System.out.print("NO");
        }
      }else{
        A -= V;
        B -= W;
        if(A<=B){
          System.out.print("YES");
        }else{
          System.out.print("NO");
        }
      }
      
    }
}
      