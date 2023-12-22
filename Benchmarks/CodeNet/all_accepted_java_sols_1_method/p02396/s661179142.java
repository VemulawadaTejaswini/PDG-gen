import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a,i=0;
    while(true){
      i++;
      a=sc.nextInt();
      if(a==0) break;
      System.out.println("Case "+i+": "+a);
    }
      sc.close();
  }
}
