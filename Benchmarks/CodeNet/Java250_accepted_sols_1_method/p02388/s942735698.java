import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
	  Scanner sc = new Scanner(System.in);
	  int x = sc.nextInt();
	  
	  int y = x;
	  
	  for(int i = 0 ; i < 2 ; i++){
		  y = y * x;
	  }
	  
	  System.out.println(y);
	  
  }
} 