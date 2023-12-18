import java.util.Scanner;
public class great {
	public static void main(String[] args) {
	 try {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = sc.next();
		char op = a.charAt(0);
		int B = sc.nextInt();		 		
		if(op=='+') {
			System.out.println(n+B);
		}
		else if(op=='-'){
			System.out.println(n-B);
		}
		else if(op=='*') {
			System.out.println(n*B);
		}
		else if(op=='/') {
			System.out.println(n/B);
		}
		else if(op=='?') {
			System.out.println(" ");
		}
	    sc.close();   
		}catch (Exception e) {
            System.out.println("例外が発生しました。");
            System.out.println(e);
 
            
		}
		}
	}
