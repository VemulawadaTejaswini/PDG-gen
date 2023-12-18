import java.io.*;
import java.util.*;
class Main{
	public static void print(Object o){
		System.out.println(o);
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (a > b){
			if (b > c){
				print(c+" "+b+" "+a);
			}else{
				print(b+" "+c+" "+a);
			}
		}else{
			if(b > c){
				if(a > c){
					print(c+" "+a+" "+b);
				}else{
					print(a+" "+c+" "+b);
				}
			}else{
				if(a>b){
					print(b+" "+a+" "+c);
				}else{
					print(a+" "+b+" "+c);
				}
			}
		}
	}
}