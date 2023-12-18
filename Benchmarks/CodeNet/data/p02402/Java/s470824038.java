import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,a,n,max=0,min=1000000,sum=0;
		n=sc.nextInt();
		for(i=0;i<n;i++){
			a=sc.nextInt();
			sum+=a;
			if(min>a){
				min=a;
			}
			if(max<a){
				max=a;
			}
		}
		System.out.println(min+" "+max+" "+sum);
		sc.close();
	}
}

