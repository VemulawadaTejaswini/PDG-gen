import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int t=sc.nextInt();
		
		int i=n%x;
		int j=n/x;
		if(i==0) {
			System.out.println(t*j);
		}
		else {
			System.out.println(t*j+t);
		}
		sc.close();
				
	}
}