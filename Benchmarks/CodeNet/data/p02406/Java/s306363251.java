import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int i = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a,b;
		
		while(i<=n){
			a = i/10;
			b = a/10;
			if(i%3==0){
				System.out.print(" "+i);
			}else if(i%10==3){
				System.out.print(" "+i);
			}else if(a%10==3){
				System.out.print(" "+i);
			}else if(b%10==3){
				System.out.print(" "+i);
			}else if(b/10==3){
				System.out.print(" "+i);
			}
			i++;
		}
		System.out.println();		
	}
}