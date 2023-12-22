import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		try{
			int n=scan.nextInt();
			String ans=scan.next();
			String input;
			for(int i=1;i<n;i++){
				input=scan.next();
				if(ans.compareTo(input)>0){
					ans=input;
				}
			}
			System.out.println(ans);
		}catch(NumberFormatException e){
			System.out.println(e);
		}
	}
}