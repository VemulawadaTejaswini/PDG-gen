import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner cin= new Scanner(System.in);
		int k=cin.nextInt();
		StringBuilder str=new StringBuilder(cin.next());
		if(str.length()<=k)
		{
			System.out.println(str);
		}
		else
		{
			str.append(str.substring(0, k));
			str.delete(0, k);
			System.out.println(str);
		}
	}

}
