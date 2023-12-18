import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<200;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c = a + b;
			String s = String.valueOf(c);
			System.out.println(s.length());
		}
	}
}