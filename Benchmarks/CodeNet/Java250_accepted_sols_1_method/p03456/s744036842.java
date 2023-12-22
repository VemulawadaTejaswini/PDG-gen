import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String a = sc.next();

		String b = sc.next();
		String c= a+b;
    double d =	Integer.parseInt(c);
		double e = Math.floor(Math.sqrt(d));
		if (d-(e*e)==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
