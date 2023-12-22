
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i=0;
		while(s.charAt(i)!='A')
		{
			i++;
		}
		int j=s.length()-1;
		while(s.charAt(j)!='Z')
		{
			j--;
		}
		System.out.println(s.substring(i,j+1).length());
	}

}
