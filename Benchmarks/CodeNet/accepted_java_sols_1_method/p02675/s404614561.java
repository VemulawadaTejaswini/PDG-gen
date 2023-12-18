import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		if (N.matches(".*[24579]$")){
			System.out.println("hon");
		}else if(N.matches(".*[0168]$")){
			System.out.println("pon");
		} else {
			System.out.println("bon");
		}
	}
}