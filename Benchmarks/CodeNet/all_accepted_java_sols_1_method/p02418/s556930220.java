import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static String s=sc.nextLine();
	private static String p=sc.nextLine();
	private static String str=s+s;
	private static boolean possible=false;
	public static void main(String[] args){
		for(int i=0;i<s.length();i++){
			String word=str.substring(i,i+p.length());
			if(word.equals(p)){
				possible=true;
			}
		}
		if(possible) System.out.println("Yes");
		else System.out.println("No");
	}
}