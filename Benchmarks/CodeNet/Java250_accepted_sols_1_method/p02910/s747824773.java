
import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);  
	
		 String S = sc.next();

		 int index1=0;
		 for(int a=0;a<S.length();a+=2)//奇数
		 {
			 	if(S.charAt(a)=='R'||S.charAt(a)=='U'||S.charAt(a)=='D') {
			 		++index1;
			 	}
		 }

		 
		 int index2=0;
		 for(int a=1;a<S.length();a+=2)
		{
					 if(S.charAt(a)=='L'||S.charAt(a)=='U'||S.charAt(a)=='D') 
						 ++index2;
		}
		 if(index1+index2 == S.length())
		 {
			 System.out.println("Yes");
		 }
		 else
			 System.out.println("No");
			
	}
			 
			
			 

		 }
	