

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int n = sc.nextInt();
			int r = sc.nextInt();
			
			if(n == 0 && r == 0)return;
			
			LinkedList<Integer> l = new LinkedList<>();
			
			for(int i = 0; i < n; i++)
			{
				l.add(n-i);
			}
			
			for(int i = 0; i < r; i++)
			{
//				System.out.println(l);
				int j = sc.nextInt()-1;
				int qty = sc.nextInt();
				
				ArrayList<Integer> l0 = new ArrayList<>();
				
				for(int k = 0; k < qty; k++)
				{
					l0.add(l.get(j));
					l.remove(j);
				}
				
//				System.out.println(l);
//				System.out.println("l0 " + l0);
				for(int k = qty-1; k >= 0; k--)
				{
					l.addFirst(l0.get(k));
				}
			}
			
			System.out.println(l.getFirst());
		}

	}

}

