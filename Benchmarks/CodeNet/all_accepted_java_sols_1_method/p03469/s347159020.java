import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        
        char[] c= s.toCharArray();
        c[3] = '8';
        System.out.print(c);
	}
}