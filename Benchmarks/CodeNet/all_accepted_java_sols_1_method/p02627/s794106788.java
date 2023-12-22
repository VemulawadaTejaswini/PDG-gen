import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		if(Character.isUpperCase(s)){
		 System.out.println("A");   
		}
		if(Character.isLowerCase(s)){
		 System.out.println("a");     
		}
	}
}