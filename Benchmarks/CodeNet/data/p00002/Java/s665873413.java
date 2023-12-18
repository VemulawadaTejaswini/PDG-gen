package ??´???;
import java.util.Scanner;
public class ??´??? {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double a,b,c,d;
		d=0;
		while(sc.hasNextInt()){
			a=sc.nextInt();
			b=sc.nextInt();
			c=a+b;
			while(c>=1){
				c=c/10;
				d++;
			}
			System.out.println((int)d);
		}
		sc.close();
	}
}