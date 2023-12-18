import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		if(s.charAt(2)==s.charAt(3)&& s.charAt(4)==s.charAt(5)){
		 System.out.println("Yes");
		}else{
		    System.out.println("No");
		}

	}

}