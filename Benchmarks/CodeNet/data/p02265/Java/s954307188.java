

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		
		int n = Integer.parseInt(sc.readLine());
		
		//
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		for(int i=0;i<n;i++)
		{
				String[] str = sc.readLine().split(" ");

				
				if(str[0].equals("insert"))
				{
					ll.addFirst(Integer.parseInt(str[1]));
				}
				
				if(str[0].equals("delete"))
				{
					int index = ll.indexOf(Integer.parseInt(str[1]));
					if(index!=-1)
						ll.remove(index);
					
				}
				
				if(str[0].equals("deleteFirst"))
				{
					ll.pollFirst();
				}
				
				if(str[0].equals("deleteLast"))
				{
					ll.pollLast();
				}
	
				
			}
			
		
//		for(int i=0;i<ll.size();i++)
//		{
//			if(i==ll.size()-1)
//				out.print(ll.get(i));
//			else
//				out.print(ll.get(i)+" ");
//		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(ll.poll());
		for(Integer s:ll)
		{
			sb.append(" ");
			sb.append(s);
		}
		out.write(sb.toString());
		out.println();
		sc.close();
		out.close();
		
	}
}

