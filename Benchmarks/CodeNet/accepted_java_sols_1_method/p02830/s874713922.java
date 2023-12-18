import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		String[] sarray = s.split("");
		String[] tarray = t.split("");

		for(int i = 0;i<n;i++){
			System.out.print(sarray[i] + tarray[i]);
		}
	}
}