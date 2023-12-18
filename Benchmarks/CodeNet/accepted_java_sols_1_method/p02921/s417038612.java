import java.util.*;

public class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
	int pair=0;
	String s1 = new String();
	String s2 = new String();
	s1=scan.nextLine();
	s2=scan.nextLine();
	char[] ch1 = s1.toCharArray();
	char[] ch2 = s2.toCharArray();
	for(int i=0;i<ch1.length;i++)
	{
		if(ch1[i]==ch2[i])
		{
			pair++;
		}
	}
	System.out.println(pair);
  }
}