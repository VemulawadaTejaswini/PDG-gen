import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		Scanner i = new Scanner(System.in);
		int a = i.nextInt();
		int b = i.nextInt();
		a &= 1;
		b &= 1;
		if(a == 1 && b == 1){
			System.out.println(new char[]{'O','d','d'});
		}else{
			System.out.println(new char[]{'E','v','e','n'});
		}
	}
}
