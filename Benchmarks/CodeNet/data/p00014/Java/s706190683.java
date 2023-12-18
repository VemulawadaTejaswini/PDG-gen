import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			try{
				int d = in.nextInt();
				int x = 600 - d;
				int S = 0;
				while(x > 0){
					S = S + x * x * d;
					x = x - d;
				}
				System.out.println(S);		
			}catch(Exception e){
				System.exit(0);
			}
		}
	}
}