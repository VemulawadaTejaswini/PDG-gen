import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n = as.nextInt();
		int m = as.nextInt();
		if(n==1){
			n = 14;
		}
		if(m==1){
			m = 14;
		}
		if(n<m){
			System.out.println("Bob");
		}else if(n>m){
			System.out.println("Alice");
		}else{
			System.out.println("Draw");
		}
	}
}