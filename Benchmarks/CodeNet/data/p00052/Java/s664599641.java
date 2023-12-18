import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count,n;
		while(true){
			n=sc.nextInt();
			count=0;
			if(n==0) break;
			while(4<n){
				n/=5;
				count+=n;
			}
			System.out.println(count);
		}
	}
}