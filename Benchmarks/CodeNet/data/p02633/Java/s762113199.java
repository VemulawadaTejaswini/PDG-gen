import java.util.Scanner;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt(),count=0,t=0;
	  while(t!=360) {
		  t+=n;
		  count++;
	  }
	  System.out.println(count);
  }
}

