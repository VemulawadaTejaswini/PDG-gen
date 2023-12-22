
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int sum=0;
	while(x>=5)
	{
		if(x>=500)
		{
			sum+=1000;
			x=x-500;
		}
		else
		{
			sum+=5;
			x=x-5;
		}
	}
	System.out.println(sum);
}
}
