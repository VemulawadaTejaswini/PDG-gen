import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		DigitNum();
	}
	
	public static void DigitNum(){
			Scanner scan = new Scanner(System.in);
			while(scan.hasNext()){
			int sum = scan.nextInt()+scan.nextInt();
			System.out.println(String.valueOf(sum).length());
		}
	}
}