import java.util.*;

class Main { 
  public static void main(String[] args)

{
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	String[] inputArray =input.split(" ");
	
	if(inputArray.length==3)
	{
		int a = Integer.parseInt(inputArray[0]);  
        	int b = Integer.parseInt(inputArray[1]);
    	        int c = Integer.parseInt(inputArray[2]);
		
		
		if(a<b && b<c )
		{
			System.out.println("Yes");
		}
		
		else
		{
			System.out.println("No");
		}
		
		
	}
  }
}