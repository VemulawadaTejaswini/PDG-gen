import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int sum=N+M;
		if (sum<10)
		{System.out.println(sum);}
		else
		{System.out.println("error");}
		
	}
}