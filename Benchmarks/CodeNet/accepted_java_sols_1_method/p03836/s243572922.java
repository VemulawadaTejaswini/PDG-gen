import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int a=x2-x1;
		int b=y2-y1;
		for(int i=0;i<a;i++){
			System.out.print("R");
		}
		for(int i=0;i<b;i++){
			System.out.print("U");
		}
		for(int i=0;i<a;i++){
			System.out.print("L");
		}
		for(int i=0;i<b;i++){
			System.out.print("D");
		}
		System.out.print("D");
		for(int i=0;i<a;i++){
			System.out.print("R");
		}
		System.out.print("RU");
		for(int i=0;i<b;i++){
			System.out.print("U");
		}
		System.out.print("L");
		System.out.print("U");
		for(int i=0;i<a;i++){
			System.out.print("L");
		}
		System.out.print("LD");
		for(int i=0;i<b;i++){
			System.out.print("D");
		}
		System.out.print("R");	
	}
}
