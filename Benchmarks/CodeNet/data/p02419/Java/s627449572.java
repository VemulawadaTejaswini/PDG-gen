import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String s1;
		ArrayList<String> al=new ArrayList<String>();
		int i=0;
		s1=scan.next().toLowerCase();
		while(scan.hasNext()){
			al.add(scan.next());
			if(al.get(i).equals("END_OF_TEXT"))
				break;
			i++;
			
		}
		int s=al.size();
		int c=0;
		for(int m=0;m<s;m++)
		{
			if(al.get(m).toLowerCase().equals(s1))
				c++;
		}
		System.out.println(c);
	}
}