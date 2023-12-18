import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum=0;

		for(int i=0;n>=i;i++) {
			int s=i;
			int check=0;
			while(true) {
			    check=check+(s%10);
			    s=s/10;
			    if(s==0)
			    	break;
			}
			if(check>=a&&check<=b) {
				sum=sum+i;
			}

		}
		System.out.println(sum);



	}

}
