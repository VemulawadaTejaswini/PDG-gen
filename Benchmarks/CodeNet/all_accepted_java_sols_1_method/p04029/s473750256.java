
import java.util.Scanner;
public class Main{

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int ame = 0;
		int value = sc.nextInt();
		for(int i =1;i <= value; i++) {
			ame += i;
		}
		System.out.println(ame);
	}

}
