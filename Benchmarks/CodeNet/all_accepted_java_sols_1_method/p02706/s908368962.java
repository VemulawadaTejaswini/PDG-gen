import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int day =sc.nextInt();
		int num =sc.nextInt();
		//int a[]=new int[num];
		
		for(int i=0;i<num;i++) {
			int a=sc.nextInt();
           day-=a;
		}
		
		if(day<0) {
			System.out.print(-1);
		}
		else {
			System.out.print(day);
		}
		sc.close();
		
	}

}