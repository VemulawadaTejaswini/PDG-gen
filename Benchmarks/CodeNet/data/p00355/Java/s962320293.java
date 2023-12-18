import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	

		Scanner s = new Scanner(System.in);


		int a = s.nextInt();
		int b = s.nextInt();
		int N = s.nextInt();

		int i=0;
		while(i<N){
			int ss=s.nextInt();
			int f=s.nextInt();
			
			if(!            ((b<=ss)||(f<=a))         ){
				System.out.println(1);
				return;
			}
			
			i = i+1;
		}
		
		System.out.println(0);


	}
}