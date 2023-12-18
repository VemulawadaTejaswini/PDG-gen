public static void insertSort(int[] arr)
	{
		/*if(arr.length==1)
		{
			return arr;
		}*/
		for(int n=1;n<arr.length;n++)
		{
			for(int i=n;i>0;i--)
			{
				if(arr[i-1]>arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
				}
			}
		}
		for(int j=arr.length-1;j>arr.length-4;j--);
		{
			System.out.println(arr[j]);
		}
	}