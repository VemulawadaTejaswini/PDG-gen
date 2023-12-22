import java.util.*;
class Main{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] argv){
		int n = scan.nextInt();
		int n1 = n%10;
		int n2 = (n%100 - n1)/10;
		int n3 = (n - n1 -n1)/100;
		if(n3==9){n = 999; System.out.println(n);return;}
		if(n1>n3 || n2>n3){
			n3 += 1;
		}
		n = n3*100 + n3*10 + n3;
		System.out.println(n);
	}
}