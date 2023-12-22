import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=new String();
		String p = new String();
		int count=0;
		 p = scan.next();
		 
		 while(scan.hasNext()){
		 str =  scan.next();
		 if(str.equals("END_OF_TEXT"))break;
		 	if(str.equalsIgnoreCase(p))count++;
		}
		 
		 System.out.println(count);
	}
}