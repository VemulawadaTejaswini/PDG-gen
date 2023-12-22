
import java.util.*;

public class Main {
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		 
		 String str=sc.next();
		 
		 if((str.charAt(0))==(str.charAt(1))&&
		 (str.charAt(2))==(str.charAt(1))&&
		 (str.charAt(0))==(str.charAt(2))){
		 	System.out.print("No");
		 }
		 else{
		 	System.out.print("Yes");
		 }
	}
}