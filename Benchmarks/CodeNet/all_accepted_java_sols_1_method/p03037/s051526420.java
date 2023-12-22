import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();
		int M=sc.nextInt();

		int Start=sc.nextInt();
		int Last=sc.nextInt();

		boolean flag=false;

		for(int i=0;i<M-1;i++){
			int s=sc.nextInt();
			int l=sc.nextInt();

			if(Start>l){
				flag=true;
				continue;
			}
			if(Last<s){
				flag=true;
				continue;
			}

			if(s>Start && Last>=s) Start=s;
			if(Last>l && Start<=l) Last=l;

		}

		if(flag) System.out.println("0");
		else System.out.println((Last-Start)+1);

		sc.close();
	}

}
