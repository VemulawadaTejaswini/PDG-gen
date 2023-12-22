import java.util.Scanner;

public class Main{

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int a=0;
		int b=0;
		int c=0;

		for(int i=n;i<1000;i++){
		 c=i/100;
	 	 b=i/10-c*10; 
		 a=i%100-b*10;
			if(a==b && b==c){
				System.out.println(i);
				break;
			}
		}



	}
}
