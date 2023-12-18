import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
	  Scanner sc = new Scanner(System.in);
	  int input = sc.nextInt();
	  
	  for(int i = 0 ; i < 3 ; i++){
		  input = input * input;
	  }
	  
	  System.out.println(input);
	  
  }
}