import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		char c;
		int i,length=s.length();
		for(i=0;i<length;i++){
			c=s.charAt(i);
			if(Character.isLowerCase(c))System.out.print(Character.toUpperCase(c));
			else if(Character.isUpperCase(c))System.out.print(Character.toLowerCase(c));
			else System.out.print(c);
		}
		System.out.print("\n");
	}
}

