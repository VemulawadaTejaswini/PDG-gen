import java.util.*;


public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
		
	    list.add(a);
	    list.add(b);
	    list.add(c);

	    Collections.sort(list);

	    int ans1 = list.get(0);
	    int ans2 = list.get(1);
	    int ans3 = list.get(2);

	    System.out.println(ans1 + " " + ans2 + " " + ans3);
	}

}