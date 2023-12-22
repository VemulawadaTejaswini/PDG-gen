import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		  try(Scanner sc = new Scanner(System.in)) {
			  StringBuffer str=new StringBuffer(sc.nextLine());
			  StringBuffer ans=str.reverse();
			  System.out.println(ans);
		  }
	}
}

