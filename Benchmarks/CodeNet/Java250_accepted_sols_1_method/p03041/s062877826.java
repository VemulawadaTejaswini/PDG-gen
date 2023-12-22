import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String t = sc.next();
		String buff = "";
		if(t.substring(k-1,k).equals("A")) {
			buff = "a";
		}else if(t.substring(k-1,k).equals("B")) {
			buff = "b";
		}else{
			buff = "c";
		}

		System.out.println(t.substring(0,k-1)+buff+t.substring(k,n));
	}
}


