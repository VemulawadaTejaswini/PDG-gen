import java.util.Scanner;


public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		int c = 0;


	while(true){

		String t = sc.next();
		if(t.equals("END_OF_TEXT")){
			break;
		}

		if(t.toLowerCase().equals(w)){
			c++;
		}

	}
		System.out.println(c);

	}

}