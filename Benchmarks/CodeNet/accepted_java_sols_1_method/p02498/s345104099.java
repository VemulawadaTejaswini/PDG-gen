import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		String s =sc2.nextLine();
		
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++)
		if(!Character.isUpperCase(c[i])) System.out.print(String.valueOf(c[i]).toUpperCase());
		else{System.out.print(String.valueOf(c[i]).toLowerCase());}
		System.out.println();
	}
}