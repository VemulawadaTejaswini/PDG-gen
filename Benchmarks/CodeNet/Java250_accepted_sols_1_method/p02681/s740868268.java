
import java.util.*;

public class Main {
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		 
		 String str=sc.next();
		 String str2=sc.next();
		 
		 char ch=str2.charAt(str2.length()-1);
		 str+=ch;
		 if(str.equals(str2))System.out.print("Yes");
		 else System.out.print("No");
	}
}