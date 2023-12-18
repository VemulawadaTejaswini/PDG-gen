import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc= new Scanner( System.in );

		String str="";
		String in_str="";
		String w_str="";

        str = sc.nextLine();
        in_str = sc.nextLine();

        w_str = str + str;

		if ( w_str.contains( in_str ) ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
		
		sc.close();
	}
}

