import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    
	  Scanner sc = new Scanner(System.in);
	  
	  int x = -1;
	  
	  int y = 1;
	  
	  while(x!=0 || y!=0){
		  
		  x = sc.nextInt();
		  
		  y = sc.nextInt();
		  
		  if(x > y){
			  System.out.println(y+" "+x);
		  }else if (x < y){
			  System.out.println(x+" "+y);
		  }else if(x == y){
			  if(x==0 && y==0){
				  //何もしない
			  }else{
				  System.out.println(x+" "+y);
			  }
		  } 
		  
	  }
 

  }
}