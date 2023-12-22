import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int suji=0;
		int res=0;
		while(sc.hasNext()) {
			suji=sc.nextInt();
			res=(suji*suji+suji+2)/2;
			System.out.println(res);
		}
	}
}
