import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int a,b;
		Scanner scan = new Scanner(System.in);
	     a = Integer.parseInt(scan.next());
	     b = Integer.parseInt(scan.next());
		if(a<b){
		System.out.println(a+"<"+b);
		}else if(a>b){
		System.out.println(a+">"+b);
		}else{
	    System.out.println(a+"=="+b);
		}
		
	}
}