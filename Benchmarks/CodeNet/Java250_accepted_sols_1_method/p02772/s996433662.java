
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner sin=new Scanner(System.in);
	    int n=sin.nextInt();
	    boolean ok=true;
		for (int i = 0; i < n; i++) {
			int a=sin.nextInt();
			if(a%2==0&&a%3!=0&&a%5!=0){
				ok=false;
			}
		}if(ok){
			System.out.println("APPROVED");
		}else System.out.println("DENIED");
    }
}
