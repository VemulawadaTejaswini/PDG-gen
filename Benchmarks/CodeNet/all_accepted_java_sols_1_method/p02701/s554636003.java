import java.util.*;
public class Main
{
	public static  void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		HashSet<String>set=new HashSet<>();
		for(int i=0;i<n;i++){set.add(sc.nextLine());}
			System.out.println(set.size());
	}
}