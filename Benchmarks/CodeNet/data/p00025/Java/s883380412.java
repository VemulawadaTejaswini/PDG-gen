public static void main (String[] args)
	{
		int hit =0;
		int blow =0;
		
		int n = args.length/8;
		
		int index =0;
		for(int i = 0; i < n; i++) 
		{
			ArrayList<String> a = new ArrayList<String>();
			for (int p=0;p<4;p++)
			{a.add(args[index]);index++;}
			
			ArrayList<String> b = new ArrayList<String>();
			for (int q=0;q<4;q++)
			{b.add(args[index]);index++;}
			
			int k=0;
			while (k<a.size())
			{
				if (a.get(k).equals(b.get(k)))
				{
					hit++;
					a.remove(k);b.remove(k);
					k--;
				}
				k++;
			}
			
			if (a.size()!=0)
			{
				for (int x=0;x<a.size();x++)
				{
					for (int y=0;y<b.size();y++)
					{
						if (x==y)
							continue;
						if(a.get(x).equals(b.get(y)))
							blow++;
					}
				}
			}
			System.out.println(hit+" "+blow);
		
        }
		
		
	}