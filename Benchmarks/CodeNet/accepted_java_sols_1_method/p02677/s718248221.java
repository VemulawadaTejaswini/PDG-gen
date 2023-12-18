import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  double a=sc.nextInt(),b=sc.nextInt(),h=sc.nextInt(),m=sc.nextInt();
	  double ah=30*h+m/2,bh=6*m;
	  double res1=Math.abs(ah-bh),res2=360-Math.abs(ah-bh);
	  double res=Math.min(res1, res2);
	  System.out.println(Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(res))));
	  //System.out.println(ah+" "+bh);
  }
}