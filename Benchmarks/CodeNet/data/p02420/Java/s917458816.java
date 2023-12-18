import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
		static int CARD_MAX=200;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> str =new ArrayList<String>();


		for(int i=0;;i++){
			 str.add(scan.next());
			 if(str.get(i).equals("-")) {
				 str.remove(i);
				 break;
			 }

			 int m = scan.nextInt();
				 while(scan.hasNextInt()){
					 int h =  scan.nextInt();
							str.set(i,shutffleString(str.get(i),h));
				 }

		}

		for (String st : str){
			System.out.println(st);
		}

	}



public static String shutffleString(String str,int h){
		String before = new String();
		String after = new String();

		for(int i = 0 ; i<h ; i++){
			before = before + str.charAt(i);
		}
		for(int i=h ; i < str.length() ;i++){
			after = after + str.charAt(i);
		}
			str = after + before;

	return str;
}

}