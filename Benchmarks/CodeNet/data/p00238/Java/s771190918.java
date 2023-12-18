import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int t = cin.nextInt();
			if(t==0)break;
			int n = cin.nextInt();
			int sum=0;
			for(int i = 0;i<n;i++){
				int s=cin.nextInt();
				int f=cin.nextInt();
				sum+=f-s;
			}
			if(sum>=t){
				System.out.println("OK");
			}
			else{
				System.out.println(t-sum);
			}
			
		}
		

	}

}