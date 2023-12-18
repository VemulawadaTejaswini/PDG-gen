

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		while(true)
		{
			String in = scan.next();
			int d = scan.nextInt();
			
			if(in.equals("0") && d == 0)break;
			
			LinkedList<Integer> l = new LinkedList<Integer>();
			
			for(int i = 0; i < d; i++)
			{
				if(i < in.length())
				{
					l.add(Integer.parseInt(in.substring(i, i+1)));
				}
				else
				{
					l.add(0);
				}
			}
			
			l.sort(null);
//			System.out.println(l);
			
			int curnum;
			int iter = 0;
			int a1 = -1;
			ArrayList<Integer> log = new ArrayList<Integer>();
			
			while(true)
			{
				iter += 1;
				String bigs = "";
				String smalls = "";
				
				for(int i = 0; i < l.size(); i++)
				{
					smalls += l.get(i);
					bigs += l.get(l.size()-1-i);
				}
				
				int big = Integer.parseInt(bigs);
				int small = Integer.parseInt(smalls);
				
				curnum = big - small;
//				if(iter<= 5)
//				System.out.println(iter + " CURNUM " + curnum);
				
				if(log.contains(curnum) || curnum == Integer.parseInt(in))
				{
					int index1;
					if(curnum == Integer.parseInt(in))
					{
						index1 = 0;
					}
					else
					{
						index1 = log.indexOf(curnum);
						index1 += 1;
					}
					System.out.println((index1) + " " + curnum + " " + (iter-index1));
					break;
				}
				else
				{
					log.add(curnum);
				}
				/*
				if(iter == 1)
				{
					a1 = curnum;
				}
				else
				{
					if(curnum == a1)
					{
						System.out.println(iter + " " + curnum);
						break;
					}
				}
				*/
				
				//
				l = new LinkedList<Integer>();
				
				for(int i = 0; i < d; i++)
				{
					if(i < Integer.toString(curnum).length())
					{
						l.add(Integer.parseInt(Integer.toString(curnum).substring(i, i+1)));
					}
					else
					{
						l.add(0);
					}
				}				
				l.sort(null);
				//
			}
		}
	}

}

