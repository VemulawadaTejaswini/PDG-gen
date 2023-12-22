import java.util.Scanner;
public class Main{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int W=sc.nextInt(),H=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt(),r=sc.nextInt();
    int X=x+r;
    int Y=y+r;
    if((X>0)&&(Y>0)){
      if((X<=W)&&(Y<=H)){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
    else{
        System.out.println("No");
      }
  }
}
