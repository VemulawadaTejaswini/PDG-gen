import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long c=n/k;
		if(k%2==0){
			int t=k/2;
			long p=0;
			if(n%k>=t){
				p++;
			}
			System.out.println(c*c*c+(c+p)*(c+p)*(c+p));
		}else{
			System.out.println(c*c*c);
		}
	}
}
