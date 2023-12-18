public static void main(String[] args) throws Exception
	{
		int[] hills = new int[]{
				1819,
				2003,
				876,
				2840,
				1723,
				1673,
				3776,
				2848,
				1592,
				922
		};

		Arrays.sort(hills);

		for (int i = 0; i < hills.length; i++){
			System.out.print("height of mountain" + (i + 1) + " " + hills[hills.length - i - 1] + "\n");
		}
	}