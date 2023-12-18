import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
	  Scanner sc = new Scanner(System.in);
	  
	  int x = 1;
	  int num = 0;
	  
	  while(x!=0){
		x = sc.nextInt();
		num = num + 1;
		if(x!=0){
			System.out.println("Case "+num+":"+x);
		}
			  
	  }
 

  }
}