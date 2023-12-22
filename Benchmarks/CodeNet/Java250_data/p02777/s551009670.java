import java.util.Scanner;

public class Main {
	static int maxn = 300 + 10;

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		int numa,numb;
		String stra,strb;
		stra=cin.next();
		strb=cin.next();
		numa=cin.nextInt();
		numb=cin.nextInt();
		String temp=cin.next();
		if(temp.equals(stra))
		{
			numa--;
		}
		else if(temp.equals(strb))
		{
			numb--;
		}
		System.out.println(numa+ " "+numb);
	}

}