import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    List<Integer> list = new ArrayList<Integer>();

		while(true)
		{
			
			
			int n = sc.nextInt();
			int count = 0;
			//一つも社員番号が出力されなかった場合に(T)が実行されます.
			
			if ( n == 0 ) break;

			for ( int i = 0; i < n; i++ )
			{
				int dg = Integer.parseInt(sc.next());
				int tanka = Integer.parseInt(sc.next());
				int num = Integer.parseInt(sc.next());

				int total = tanka * num;

				if ( total >= 1000000 ) {
					System.out.println(dg);
					count += 1;
				}
				
			}
			
			if ( count == 0 ) System.out.println("NA"); //(T)

		}

	}
 
}	