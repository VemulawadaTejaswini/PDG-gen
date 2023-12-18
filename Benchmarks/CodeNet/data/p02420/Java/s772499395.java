import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
		static int CARD_MAX;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> str =new ArrayList<String>();


		for(int i=0;;i++){
			 str.add(scan.next());
			 if(str.get(i).equals("-")) break;
			 int m = scan.nextInt();
				 while(scan.hasNextInt()){
					 int h =  scan.nextInt();
					 str.set(i,shutffleString(str.get(i),h,m));
				 }
		
		}
		
		for (String st : str){
			System.out.println(st);
		}

	}



public static String shutffleString(String str,int h,int m){
		char[] before = new char[CARD_MAX];
		char[] after  = new char[CARD_MAX];
	for(int j=0;j<m;j++){
		for(int i = 0 ; i<h-1 ; i++){
			before[i]=str.charAt(i);
		}
		for(int i=h; i<str.length() ;i++){
			after[i]=str.charAt(i);
		}
			str=String.join(String.valueOf(after), String.valueOf(before));
	}
	return str;
}

}