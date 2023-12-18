import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    int A = scan.nextInt();
    int ans=0;
    for(;H>0;H-=A){
      ans+=1;
    }
    System.out.println(ans);
  }
}