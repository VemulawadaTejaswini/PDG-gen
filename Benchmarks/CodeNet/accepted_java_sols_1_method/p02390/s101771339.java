import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int h = (x-x%3600)/3600;
		int m = ((x%3600)-((x%3600)%60))/60;
		int s = (x%3600)%60;
		System.out.println(h+":"+m+":"+s);
	}
}