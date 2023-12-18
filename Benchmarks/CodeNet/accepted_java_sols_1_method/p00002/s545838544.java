import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a+b;
			int count=0;
			while(0<c){
				c/=10;
				count++;
			}
			System.out.println(count);
		}
	}
}