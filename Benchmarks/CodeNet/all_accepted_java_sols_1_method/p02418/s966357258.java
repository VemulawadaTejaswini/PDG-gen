import java.util.Scanner;

public class Main {
	public static Scanner sc;
	public static void main(String[] args){
		sc = new Scanner(System.in);
		String s=sc.nextLine();
		String p=sc.nextLine();
		s=s+s;
		
		if(s.indexOf(p)==-1)System.out.println("No");
		else System.out.println("Yes");
	}

}