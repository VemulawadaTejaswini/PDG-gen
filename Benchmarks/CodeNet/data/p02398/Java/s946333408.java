import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int i=a;
		int x=0;
		while(i<=b){
			if(c%i==0){
				x++;
			}
			i++;
		}
		System.out.println(x);
	}
}