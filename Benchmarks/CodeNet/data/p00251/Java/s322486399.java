import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int sum = 0;
		while(sn.hasNext()) sum+= sn.nextInt();
		System.out.println(sum);
	}
}