import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	
	String[] strArray = str.split("");
	
	int count = 0;
	
	for(int i = 0; i < strArray.length ; i++ ) {
	if(strArray[i].equals("1")) {
		count++;
	  }
	 }
	System.out.println(count);
	}
}