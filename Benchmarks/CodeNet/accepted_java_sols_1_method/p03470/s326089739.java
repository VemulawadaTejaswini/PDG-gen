import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),work;
		int[] mochi = new int[N];
		int Num=0,count=0;
		
		for(int i=0;i<N;i++) 
			mochi[i]=sc.nextInt();
		
		for(int i=0;i<N;i++) 
		{
			for(int k=i;k<N;k++) 
			{
				if(mochi[i] > mochi[k])
				{
					work = mochi[i];
					mochi[i] = mochi[k];
					mochi[k] = work;
				}
			}
		}
		
		
		for(int i=0;i<N;i++) 
		{
			if(Num != mochi[i]) 
			{
				count+=1;
				Num=mochi[i];
			}
		}
		System.out.print(count);

	}

}
