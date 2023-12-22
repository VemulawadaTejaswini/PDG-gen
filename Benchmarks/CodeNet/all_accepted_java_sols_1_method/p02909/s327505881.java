import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
        char a=s.charAt(0);
        if(a=='S') {
        	System.out.println("Cloudy");
        }else if(a=='C') {
        	System.out.println("Rainy");
        }else {
        	System.out.println("Sunny");
        }

	}

}
