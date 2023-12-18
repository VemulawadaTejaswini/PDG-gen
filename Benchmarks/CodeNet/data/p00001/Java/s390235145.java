
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mountainHeight= {1819,2003,876,2840,1723,1673,3776,2848,1592,922};
		
		int[] maxHeight={0,0,0};
		
		for(int i=0;i<mountainHeight.length;i++)
		{
			if(mountainHeight[i]>=maxHeight[2])
			{
				if(mountainHeight[i]>=maxHeight[1])
				{
					if(mountainHeight[i]>=maxHeight[0])
					{
						maxHeight[2]=maxHeight[1];
						maxHeight[1]=maxHeight[0];
						maxHeight[0]=mountainHeight[i];
					}
					else
					{
						maxHeight[2]=maxHeight[1];
						maxHeight[1]=mountainHeight[i];
					}
				}
				else
				{
					maxHeight[2]=mountainHeight[i];
				}
			}
		}
		
		//System.out.println("The biggest mountains are:");
		for(int i=0;i<3;i++)
		{
			System.out.println(maxHeight[i]);
		}
		//System.out.println("Hello World");

	}

}