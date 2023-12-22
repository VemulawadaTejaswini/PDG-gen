import java.util.*;
class Main{
  public static void main(String[] arg){
    Scanner stdIn=new Scanner(System.in);
    int A=stdIn.nextInt();
    int B=stdIn.nextInt();
    int C=stdIn.nextInt();
    int max=Math.max(A,Math.max(B,C));
    int min=Math.min(A,Math.min(B,C));
    if(A+B+C==17&&max==7&&min==5){
    	System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
    