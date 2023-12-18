import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);

		int n, i, count,j;
		while(true){
			count=0;
			n=sc.nextInt();

			if(n==0)
				break;
			if(n==1)
				count=1;

			for(i=n+1;i<=2*n;i++){
				for(j=2;j<i;j++){
					if(i%j==0)
						break;
				}
				if(j==i)
					count++;
			}
			System.out.println(count);
		}
	}
}