import java.util.*;
	public class Main {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int tot=0;
			int len=sc.nextInt();
			int tri[]=new int[len];
			for(int l=0;l<len;l++)
				tri[l]=sc.nextInt();
			
			Arrays.sort(tri);
		   for(int i=0;i<len-2;i++)
		   {
			   for(int j=i+1;j<len-1;j++)
			   {
				   if(tri[i]==tri[j])
				    continue;			   
				   else
				   {
					   for(int k=j+1;k<len;k++)
					   {
						   if(tri[i]==tri[k]||tri[j]==tri[k])
							   continue;
						   else
						   {
							   if(tri[i]+tri[j]>tri[k])
								   tot++;
						   }
					   }
				   }
			   }
		   }
			System.out.println(tot);
		}

	}

