import java.util.*;
import java.io.*;
class Main{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int c=sc.nextInt();
	 String[] letter = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

	 
	 int i=0,j=0;
	 String str="";
	 while(c>26)
	 {
	 	
	 	i=c/26;
	 	j=c%26;
	 	str=letter[j-1]+str;
	 	c=i;

	 }
	 str=letter[c-1]+str;
	 
	 
	System.out.println(str);
	
				
		
	}
}