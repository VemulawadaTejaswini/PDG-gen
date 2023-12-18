import java.util.*;
 
class Main{
  	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      double A = sc.nextInt();
      double V = sc.nextInt();
      double B = sc.nextInt();
      double W = sc.nextInt();
      int T = sc.nextInt();
      //System.out.print(A+""+V+""+B+""+W+""T);
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
      