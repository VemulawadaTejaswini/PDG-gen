import java.util.Scanner;
  
public class Main {
	
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int W=Integer.parseInt(sc.next());
	  int H=Integer.parseInt(sc.next());
	  int x=Integer.parseInt(sc.next());
	  int y=Integer.parseInt(sc.next());
	  int r=Integer.parseInt(sc.next());
	  
	  
	  if(y+r<=H&&y-r>=0){
		  if(x+r<=W&&x-r>=0){
			  System.out.println("Yes");
		  }
		  else{
			  System.out.println("No");
		  }
	  }
	  else{
		  System.out.println("No");
	  }
	  
    
  }
}