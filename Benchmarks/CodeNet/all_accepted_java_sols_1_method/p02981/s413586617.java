import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b>a*n){
			System.out.println(a*n);
		}else{
			System.out.println(b);
		}
	}
}


