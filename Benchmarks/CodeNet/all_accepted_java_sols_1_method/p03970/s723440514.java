import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("");
		sc.close();
		String[] t = {"C","O","D","E","F","E","S","T","I","V","A","L","2","0","1","6"};
		int count = 0;
		for(int i = 0; i < 16; i ++) {
			if( !(s[i].equals(t[i])) ) {
				count++;
			}
		}
		System.out.println(count);
	}
}