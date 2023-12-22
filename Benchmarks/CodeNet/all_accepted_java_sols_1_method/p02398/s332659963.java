import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int a;
		int b;
		int c;
		int d=0;
		Scanner scan =new Scanner(System.in);
		
	 a=scan.nextInt();
	 b=scan.nextInt();
	 c=scan.nextInt();
		for(int i=a;i<=b;i++){
			if(c%i==0)
				d++;
			
			
		}
		System.out.println(d);
	}

}
