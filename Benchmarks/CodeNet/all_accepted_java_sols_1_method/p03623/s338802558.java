
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
	Scanner sc	= new Scanner(System.in);
	int x = sc.nextInt();
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	int s,t;
	
	if(a<x){
		s = x - a;
	}else {
		s =a - x;
	}
	
	if(b<x){
		t = x - b;
	}else {
		t = b - x;
	}
	
	if (t<s) {
		System.out.println("B");
	} else {
		System.out.println("A");
	}
	
	}
}
