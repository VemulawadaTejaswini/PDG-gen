import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int i=1;
		while(true){
			int input = scan.nextInt();
			if(input==0){
				break;
			}
			System.out.println("Case "+i+": "+input);
			i+=1;
		}
	}
}