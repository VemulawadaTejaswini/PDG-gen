import java.util.Scanner;
import java.io.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			String s = sc.nextLine();
			int n = s.length();
			int a[] = new int[n]; 
			int p=0;
			if(s.equals("0")) break;
			for(int i=0;i<n;i++){
				a[i]= (int)(s.charAt(i))-'0';
			}
			for(int x=0;x<n;x++){
				p+=a[x];
			}
			System.out.println(p);
		}
	}
}