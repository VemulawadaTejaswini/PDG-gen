public class Main
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader br = new java.io.BufferedReader( new java.io.InputStreamReader( System.in ) );
		
		String[] st = br.readLine().split(" ");
		int[] nums = new int[st.length];
		for( int i = 0 ; i < nums.length ; i++ ) nums[i] = Integer.parseInt( st[i] );
		
		
		int x;
		boolean exchange = true;
		while( exchange )
		{
			exchange = false;
			for( int i = 0 ; i < (nums.length - 1) ; i++ )
			{
				if( nums[i] > nums[i+1] )
				{
					x = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = x;
					exchange = true;
				}
			}
		}
		
		String result = "";
		for( int i = 0 ; i < nums.length ; i++ )
		{
			 if( i < (nums.length -1) ){
				 result += ( nums[i] + " " );
			}else{
				result += nums[i];
			}
		}
		System.out.println( result );
	}
}