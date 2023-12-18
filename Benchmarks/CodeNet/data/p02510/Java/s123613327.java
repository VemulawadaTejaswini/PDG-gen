import java.util.Scanner;
import java.io.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String ds1,ds2;
		while(true){
			String s = sc.nextLine();
			if(s.equals("-")){
				break;
			}
			int l=s.length();
			int n = sc.nextInt();
			for(int i=0;i<n;i++){
				int h = sc.nextInt();
				ds1=s.substring(l-h,l);
				ds2=s.substring(0,l-h);
				s=ds1+ds2;
			}
			System.out.println(s);
		}
	}
}