import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=Integer.parseInt(scan.next());
		int b=Integer.parseInt(scan.next());
		int temp=0;
		while(a!=0 || b!=0){
			if(a>b){
				temp = a;
				a = b;
				b = temp;
			}
			System.out.println(a+" "+b);
			a=Integer.parseInt(scan.next());
			b=Integer.parseInt(scan.next());
		}	
		scan.close();
	}
}