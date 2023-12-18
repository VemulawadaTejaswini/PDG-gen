import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  int sum=0;
	  while(sum<n) {
		  sum+=1000;
	  }
	  System.out.println(sum-n);
  }
}
