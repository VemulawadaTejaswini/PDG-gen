import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int count=0;
			int div=5;
			while(n/div!=0){
				count+=n/div;
				div*=5;
			}
			System.out.println(count);
		}
	}
}