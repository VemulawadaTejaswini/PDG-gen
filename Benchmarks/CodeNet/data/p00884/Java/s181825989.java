import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{

    @SuppressWarnings("unchecked")
      public static void main(String args[])throws IOException
    {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	while(true)
	    {
		int n = Integer.parseInt(in.readLine());
		if(n == 0)
		    break;
		StringBuilder line = new StringBuilder(in.readLine());
		for(int i=0;i<line.length();i++)
		    {
			char c = line.charAt(i);
			if(c == ':' || c == ',' || c == '.')
			    {
				line.replace(i,i+1," ");
			    }
		    }
		HashMap<String,Boolean> map = new HashMap<String,Boolean>();
		String[] elements = String.valueOf(line).split(" ");
		for(int i=1;i<elements.length;i++)
		    {
			map.put(elements[i],true);
		    }

		HashMap<String,Integer> index = new HashMap<String,Integer>();
		LinkedList<String>[] list = new LinkedList[n+1];
		for(int i=0;i<n+1;i++)
		    {
			list[i] = new LinkedList<String>();
		    } 
		int pos = 0;
		for(int i=1;i<n;i++)
		    {
			line = new StringBuilder(in.readLine());
			for(int j=0;j<line.length();j++)
			    {
				char c = line.charAt(j);
				if(c == ':' || c == ',' || c == '.')
				    {
					line.replace(j,j+1," ");
				    }
			    }	
			elements = String.valueOf(line).split(" ");
			index.put(elements[0],pos);
			pos++;
			
			for(int j=1;j<elements.length;j++)
			    {
				list[pos-1].add(elements[j]);
			    }
			
		    }

		boolean fin = false;
		while(!fin)
		    {
			fin = true;
			for(String s: index.keySet())
			    {
				if(map.containsKey(s))
				    {

					map.remove(s);
					for(int j=0;j<list[index.get(s)].size();j++)
					    {
						map.put(list[index.get(s)].get(j),true);						
					    }
					fin = false;
					index.remove(s);
					break;
				    }
			    }

		    }

		/*
		for(String s: map.keySet())
		    {
			System.out.println("content : " + s);
		    }
		*/
		System.out.println(map.size());
	    }
    }

}