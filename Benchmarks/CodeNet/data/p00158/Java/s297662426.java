import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int count;
		while(true){
			n=sc.nextInt();
			if(n==0) break;
			count=0;
			while(true){
				if(n==1) break;
				if(n%2==0){
					n/=2;
					count++;
				}
				else{
					n=n*3+1;
					count++;
				}
			}
			System.out.println(count);
		}	
	}
}