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

	    for ( int i = 0; i < list.size(); i++ ) {
			int item = list.get(i);
			System.out.printf("%d ", item);

			
		}
		
	}

}