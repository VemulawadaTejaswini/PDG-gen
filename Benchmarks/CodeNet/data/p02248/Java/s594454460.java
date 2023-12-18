

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String t = sc.next(); //big text
		String s = sc.next(); //small string
		
		//prepare kmp
		int[] kmp = new int[s.length()];
		{
			int i = 1, j = 0;
			while(i < s.length())
			{
//				System.out.println("i = " + i + ", j = " + j);
				if(s.charAt(i) == s.charAt(j))
				{
					kmp[i] = j+1; //i is the length of prefix that's also current suffix
					j++;
					i++;
				}
				else if(j == 0)
				{ //mismatch
					kmp[i] = 0;
					i++;
				}
				else
				{  //mismatch: try again with j rolled back
					//kmp[i] = j+1;
					j = kmp[j-1];
				}
			}
		}
		
//		System.out.println(Arrays.toString(kmp));
		
		StringBuilder sb = new StringBuilder();
		//begin search
		int j = 0;
		int i = 0;
		int c = 0;
		int mat = 0;
//		System.out.println("START");
		while(i < t.length())
		{
//			System.out.println(i + " " + j);
			if(t.charAt(i) == s.charAt(j))
			{
				if(j == s.length()-1)
				{ //whole pattern matched
					//MATCH!
					{
//						System.out.println("Match at " + (i-s.length()+1) + "~" + (i));
						sb.append((i-s.length()+1));
						sb.append('\n');
					}
					if(j > 0) //do the same as if mismatched, so that overlapped matches will all be found
						j = kmp[j-1];
					else
					{
						j = 0;
						i++;
					}
				}
				else
				{ //letter matched: go to next letter
					i++;
					j++;
				}
			}
			else
			{ //mismatch
				if(j > 0)
					j = kmp[j-1];
				else
				{
					j = 0;
					i++;
				}
			}
			
		}
		
		System.out.print(sb);
//		System.out.println(c);
		
		
	}
}

