
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String n = sc.next();
	char[] a = new char[4];
	for(int i=0; i<4; i++){
		a[i] = n.charAt(i);
	}
	boolean b = false;
	if(a[1] == a[2]){
		if(a[1] == a[0] || a[1] == a[3]){
			b=true;
		}
	}
	if(b){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
	sc.close();

	}
}
