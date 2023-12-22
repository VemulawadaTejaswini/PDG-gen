import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		String str = sc.next();
		
		if(str.compareTo("2019/04/30")<=0)System.out.println("Heisei");
		else System.out.println("TBD");
	}

}