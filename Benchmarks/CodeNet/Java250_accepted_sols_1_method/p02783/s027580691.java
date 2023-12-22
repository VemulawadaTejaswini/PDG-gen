import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int h=input.nextInt();
		int a = input.nextInt();
		int sum=0;
		sum+=h/a;
		if(h%a >0)
			sum+=1;
		System.out.println(sum);
				
		

	}

}
