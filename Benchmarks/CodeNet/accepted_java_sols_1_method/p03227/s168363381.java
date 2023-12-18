import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) {
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		if(str.length()==2)
			System.out.println(str);
		else
		{
			for(int i=str.length()-1;i>=0;i--)
				System.out.print(str.charAt(i));
			System.out.println();
		}
	}
}