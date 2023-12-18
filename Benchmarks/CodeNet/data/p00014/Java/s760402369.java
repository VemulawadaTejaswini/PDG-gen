import java.util.ArrayList;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int d=sc.nextInt();
			double sum=0;
			for(int i=1;600>=d*(i+1);i++){
				sum+=Math.pow(i*d,2)*d;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}