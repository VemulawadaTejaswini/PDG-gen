import java.util.Scanner;

public class Main { 
  public static void main(String[] args){
	  for(;;) {
	  Scanner sc = new Scanner(System.in);
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  if(a>=b) {
		  System.out.printf("%d %d\n",b,a);
	  }
	  else {
		  System.out.printf("%d %d\n",a,b);
	  }

 
	  }
  }
}

