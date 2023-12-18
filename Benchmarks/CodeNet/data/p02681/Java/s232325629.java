import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 
		 String str=sc.next();
		 String str2=sc.next();
		 
		 
		boolean j=false;
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			char ch2=str2.charAt(i);
			if(ch==ch2)j=true;
			else {j=false;break;}
		}
		
		if(j)System.out.println("Yes");
		else System.out.println("No");
				
	}
}
