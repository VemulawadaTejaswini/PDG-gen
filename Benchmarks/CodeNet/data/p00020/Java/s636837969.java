import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
		String str = sc.next();
		str = str.toUpperCase();
		System.out.print(str+" ");
		}		
	}

}