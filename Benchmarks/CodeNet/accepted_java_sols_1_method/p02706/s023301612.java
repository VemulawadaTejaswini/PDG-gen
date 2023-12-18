import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long days = sc.nextLong();
		long num = sc.nextLong();
		for(long i=0;i<num;i++){
			long x = sc.nextLong();
			days-=x;
		}
		if(days>=0)
			System.out.println(days);
		else
			System.out.println("-1");
	}
}

