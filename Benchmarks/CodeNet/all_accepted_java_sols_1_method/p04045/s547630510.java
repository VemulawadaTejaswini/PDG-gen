import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		int k = sc.nextInt();
		char d[] = new char[k];

		String s="";
		String f="";

	    for (int i = 0; i < k ;i++){
	    	f += sc.next();
	    	if(i+1 !=k)f += "|";

	    }


	    Pattern p = Pattern.compile(f);

		for (; ;) {
			s = String.valueOf(n);

			if(!p.matcher(s).find()){
				break;
			}

			n++;
		}

		System.out.println(n);




		sc.close();
	}
}
