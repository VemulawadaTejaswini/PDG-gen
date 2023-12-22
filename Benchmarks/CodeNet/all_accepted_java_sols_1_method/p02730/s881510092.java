
import java.util.*;

public class Main {
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		 
		 String str=sc.next();
		 int len=str.length();
		 int i=0,j=len-1;
		 boolean ju=true;
		 
		 while(i<j){
		 	if(str.charAt(i++)!=str.charAt(j--)){
				ju=false;
				System.out.println("No");
				System.exit(0);
		 	}
		 }
		 
		 i=0;
		 j=(len-1)/2;
		 j-=1;
		 while(i<j){
		 	if(str.charAt(i++)!=str.charAt(j--)){
				ju=false;
				System.out.println("No");
				System.exit(0);
		 	}
		 }
		 
		 i=(len+3)/2;
		 i-=1;
		 j=len-1;
		  while(i<j){
		 	if(str.charAt(i++)!=str.charAt(j--)){
				ju=false;
				System.out.println("No");
				System.exit(0);
		 	}
		 }
		 
		 if(ju)System.out.println("Yes");
	}
}