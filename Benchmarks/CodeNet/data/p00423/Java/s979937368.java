import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int a, b;
			int c = 0;
			int d = 0;
			for(int i=0;i<n;i++){
				a = sc.nextInt();
				b = sc.nextInt();
				if(a==b){
					c += a;
					d += b;
				}else if(a>b){
					c += a+b;
				}else{
					d += a+b;
				}
			}
			System.out.println(c + " " + d);
		}
	}
}