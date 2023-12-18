import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String T=sc.next();
		sc.close();
		String[] a = T.split("");
		
		if(a[T.length()-1].equals("?")) {
			a[T.length()-1]="D";
		}
		for(int i=T.length()-2;i>=0;i--){
			if(a[i].equals("?")) {
				if(a[i+1].equals("D"))
					a[i]="P";
				else
					a[i]="D";
			}
		}
		for(int i=0;i<T.length();i++)
			System.out.print(a[i]);
	}
}
