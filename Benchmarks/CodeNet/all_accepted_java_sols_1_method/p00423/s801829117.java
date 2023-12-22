
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n;
		int a,b,count_a,count_b;
		
		while(true){
			count_a=count_b=0;
			n=sc.nextInt();
			if(n==0) break;

			for(i=0;i<n;i++){
				a=sc.nextInt();
				b=sc.nextInt();
				if(a==b){
					count_a+=a;
					count_b+=b;
				}
				else if(a>b){
					count_a+=(a+b);
				}
				else if(b>a){
					count_b+=(a+b);
				}
			}
			System.out.println(count_a+" "+count_b);
		}
	}
}