import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		 long x = scn.nextInt();
		 long val=x/500;
		 long val2 =(x%500);
		 long ans = (val*1000)+((val2/5)*5);
		 System.out.println(ans);

	}

}