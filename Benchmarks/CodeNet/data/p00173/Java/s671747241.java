import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<9;i++){
		String a=scan.next();	
		int b =scan.nextInt();
		int c =scan.nextInt();
		int sum=b+c;
		int ans=b*200+c*300;
		System.out.println(a+" "+sum+" "+ans);
		}
	}
}