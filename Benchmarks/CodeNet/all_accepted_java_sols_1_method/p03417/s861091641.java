import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long m=sc.nextLong();
		if(n>=2 && m>=2){
			System.out.println(n*m-(2*n+2*m-4));
		}else{
			if(n==1 && m==1){
				System.out.println(1);
			}else{
				int max=Math.max((int)n,(int)m);
				System.out.println(max-2);
			}
		}
	}
}

