import java.util.*;

class Main 
{ 
  public static void main(String[] args)

{
	Scanner sc=new Scanner(System.in); 
	String input=sc.nextLine();
	String[] inputArray =input.split(" ");
	
		int x = Integer.parseInt(inputArray[0]);  
    	int y = Integer.parseInt(inputArray[1]);  
    	
		while(x>y)
		{
			
			int t=x;
			x=y;
			y=t;
			
		
		
		 if(x==0 && y==0)
		{
     		
			break;
		    
		}
		System.out.println(x+" "+y);
		}
		
}

}