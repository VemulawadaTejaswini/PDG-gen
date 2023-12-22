import java.util.*;

public class Main { 
	// Driver program to test above function 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
      	long num = sc.nextLong();
      	StringBuilder columnName = new StringBuilder(); 

		while (num > 0) { 
		
			long rem = num % 26; 
			if (rem == 0) { 
				columnName.append("Z"); 
				num = (num / 26) - 1; 
			} 
			else 
			{ 
				columnName.append((char)((rem - 1) + 'A')); 
				num = num / 26; 
			} 
		} 
		String lowerCase = columnName.toString().toLowerCase();
      	char c[]=lowerCase.toCharArray();
		String reverse="";

		for(int i=c.length-1;i>=0;i--){
			reverse+=c[i];
			}
		System.out.println(reverse); 
	} 
      	
} 

