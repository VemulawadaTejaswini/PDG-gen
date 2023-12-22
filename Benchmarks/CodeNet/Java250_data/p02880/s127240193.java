import java.util.*;

public class Main {

	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);

		int n= sc.nextInt();
		String stuff= "No";

		for (int i=1; i<=9; i++) {

			if ((n%i)==0 && i<=9){
				if(n/i > 9)
					stuff = "No";
				else
					stuff="Yes";
			}
		}

		System.out.println(stuff);
	}

}