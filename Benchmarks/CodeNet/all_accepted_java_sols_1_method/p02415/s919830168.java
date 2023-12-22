import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	char c;

	for(int i=0;i<str.length();i++){
	    c=str.charAt(i);
	    if(Character.isUpperCase(c))System.out.print(Character.toLowerCase(c));
	    else System.out.print(Character.toUpperCase(c));
	}
	System.out.println();
    }
}
							   
	

