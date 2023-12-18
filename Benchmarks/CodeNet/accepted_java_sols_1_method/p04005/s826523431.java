import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
			if(a%2==1 && b%2==1 && c%2==1) System.out.println(Math.min(b*c,Math.min(b*a,c*a)));
			else System.out.println(0);
		}
	}
}