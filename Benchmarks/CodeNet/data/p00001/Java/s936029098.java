class Main{
    public static void main(String[] args){
		if(args.length < 3)
		{
			System.out.println("Error!");
			return;
		}
		int[] meters = new int[args.length];
		for(int i = 0;i < args.length;i++)
		{
			meters[i] = Integer.parseInt(args[i]);
		}
		int first = 0,second = 0,third = 0;
		for(int i = 0;i < meters.length;i++)
		{
			if(meters[i] > third)
			{
				//3番目より高い
				if(meters[i] > second)
				{
					if(meters[i] > first)
					{
						third = second;
						second = first;
						first = meters[i];
					}
					else
					{
						third = second;
						second = meters[i];
					}
				}
				else
				{
					//3番目の高さ
					third = meters[i];
				}
			}
		}
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
    }
}