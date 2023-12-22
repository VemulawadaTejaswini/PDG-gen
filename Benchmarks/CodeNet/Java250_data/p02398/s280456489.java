import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> x = new ArrayList<String>();

		while(sc.hasNextInt()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int sum=0;
			
			if(a<=b){
				for(int i=a;i<=b;i++){
					if(c%i==0){
						sum++;
					}
				}
				System.out.println(sum);
			}
			
		}
	}
}
