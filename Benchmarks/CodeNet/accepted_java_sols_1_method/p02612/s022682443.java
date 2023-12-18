import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int onedan=sc.nextInt();
   int X=onedan%1000;
   int x=1000-X;
   if(x==1000) {
	   System.out.println(x-1000);
   }else {
	   System.out.println(x);
   }
  }
}