import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String o=sc.next();
        String e=sc.next();
        for(int i=0;i<o.length()+e.length();i++) {
        	if(i%2==0)	System.out.print(o.charAt(i/2));
        	else		System.out.print(e.charAt(i/2));
        }

    }
}