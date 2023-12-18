import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String T=sc.next();
		sc.close();
		String[] a = T.split("");
	
		for(int i=0;i<T.length();i++){
			if(a[i].equals("?")) {
					a[i]="D";
			}
		}
		for(int i=0;i<T.length();i++)
			System.out.print(a[i]);
	}
}
