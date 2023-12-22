import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		try{
			String line;
			while(!(line=scan.next()).equals("0")){
				int ans=0;
				for(int i=0;i<line.length();i++){
					ans+=Character.getNumericValue(line.charAt(i));
				}
				System.out.println(ans);
			}
		}catch(NumberFormatException e){
			System.out.println(e);
		}
	}
}