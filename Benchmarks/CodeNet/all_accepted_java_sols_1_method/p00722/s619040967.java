import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static boolean p[]=new boolean[1000000];

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,count,a,d,n;
		Arrays.fill(p, true);
		p[0]=p[1]=false;
		for(i=2;i<=1000;i++){
			if(p[i]){
				for(j=2;i*j<1000000;j++){
					p[i*j]=false;
				}
			}
		}
		while(true){
			a=sc.nextInt();
			d=sc.nextInt();
			n=sc.nextInt();
			if(a+d+n==0) break;
			count=0;
			for(;;){
				if(p[a]) count++;
				if(count==n){
					System.out.println(a);
					break;
				}
				a+=d;
			}
		}
	}

}