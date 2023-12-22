import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int judge=0, k=sc.nextInt(), a=sc.nextInt(), b=sc.nextInt();
    for(int i=a; i<=b; i++){
      if(i%k==0){
        judge=1;
        break;
      }
    }
    if(judge==1) System.out.print("OK");
    else System.out.print("NG");
  }
}