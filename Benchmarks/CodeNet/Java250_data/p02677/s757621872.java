import java.util.Scanner;


class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   int C = sc.nextInt();
   int D = sc.nextInt();
   
    double radian = Math.PI*2*(C/12.0 + (D/60.0)/12.0 - D / 60.0);
   
  
   System.out.println(Math.sqrt((double)((A*A)+(B*B)-(2*A*B*Math.cos(radian)))));
 
 }
}
