import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag =true;
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int m=sc.nextInt();
			if(m%2==0&&(m%5!=0&&m%3!=0)) {
				flag=false;
				break;
			}
		}
		if (flag)System.out.println("APPROVED");
		else System.out.println("DENIED");
	}
	
} 