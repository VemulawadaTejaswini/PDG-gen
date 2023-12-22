import java.util.Scanner;
//import java.util.Random;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		
		String s=stdIn.next();
		
		int idx=s.indexOf("7");
		if(idx==-1) System.out.println("No");
		else System.out.println("Yes");
	}
}