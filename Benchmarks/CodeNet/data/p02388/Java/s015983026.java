import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
	  Scanner sc = new Scanner(System.in);
	  int x = sc.nextInt();
	  
	  for(int i = 0 ; i < 3 ; i++){
		  x = x * x;
	  }
	  
	  System.out.println(x);
	  
  }
} 