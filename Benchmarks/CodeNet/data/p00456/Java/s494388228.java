import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		List<Integer> wList = new ArrayList<Integer>();
		List<Integer> kList = new ArrayList<Integer>();
		for(int i = 0; i < 10; ++i)
		{
			int a = stdIn.nextInt();
			wList.add(a);
		}
		for(int i = 0; i < 10; ++i)
		{
			int a = stdIn.nextInt();
			kList.add(a);
		}
		Collections.sort(wList);
		Collections.sort(kList);
		System.out.println((wList.get(wList.size() - 1) + wList.get(wList.size() - 2) + wList.get(wList.size() - 3)) + " " + (kList.get(kList.size() - 1) + kList.get(kList.size() - 2) + kList.get(kList.size() - 3)));
	}
}