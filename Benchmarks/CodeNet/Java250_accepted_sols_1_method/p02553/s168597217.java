import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
	long a=scan.nextInt(),b=scan.nextInt(),c=scan.nextInt(),d=scan.nextInt();
    long  x1,x2;
    x1=Math.max(a*c,a*d);
    x2=Math.max(b*c,b*d);
    x1=Math.max(x1,x2);
    System.out.println(x1);
  }
}