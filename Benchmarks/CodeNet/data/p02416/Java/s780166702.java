import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int sum=0;
		int r=1;
		while(a!=0){
			int digit = Integer.toString(a).length();
			for(int i=0;i<digit;i++){
				r=r*10;
			}
			for(int i=0;i<=digit;i++){
				sum+=a/r;
				a=a%r;
				r=r/10;
			}
			System.out.println(sum);
			sum=0;
			r=1;
			a=scan.nextInt();
		}
	}

}