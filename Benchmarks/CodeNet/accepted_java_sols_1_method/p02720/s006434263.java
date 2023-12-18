import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int k=s.nextInt();
		
		ArrayList<Long> list=new ArrayList<>();
		
		for(long i=0;i<10;i++)
		{
			list.add(i);
		}
		
		int curr=1;
		
		for(long i=10;i<100010;i++)
		{
			if(list.get(curr)%10==0)
			{
				long val1=list.get(curr)*10+0;
				long val2=list.get(curr)*10+1;
				
				list.add(val1);
				list.add(val2);
				
				curr++;
			}
			else if(list.get(curr)%10==1)
			{
				long val1=list.get(curr)*10+0;
				long val2=list.get(curr)*10+1;
				long val3=list.get(curr)*10+2;
				
				list.add(val1);
				list.add(val2);
				list.add(val3);
				
				curr++;
			}
			else if(list.get(curr)%10==2)
			{
				long val1=list.get(curr)*10+1;
				long val2=list.get(curr)*10+2;
				long val3=list.get(curr)*10+3;
				
				list.add(val1);
				list.add(val2);
				list.add(val3);
				
				curr++;
			}
			else if(list.get(curr)%10==3)
			{
				long val1=list.get(curr)*10+2;
				long val2=list.get(curr)*10+3;
				long val3=list.get(curr)*10+4;
				
				list.add(val1);
				list.add(val2);
				list.add(val3);
				
				curr++;
			}
			else if(list.get(curr)%10==4)
			{
				long val1=list.get(curr)*10+3;
				long val2=list.get(curr)*10+4;
				long val3=list.get(curr)*10+5;
				
				list.add(val1);
				list.add(val2);
				list.add(val3);
				
				curr++;
			}
			else if(list.get(curr)%10==5)
			{
				long val1=list.get(curr)*10+4;
				long val2=list.get(curr)*10+5;
				long val3=list.get(curr)*10+6;
				
				list.add(val1);
				list.add(val2);
				list.add(val3);
				
				curr++;
			}
			else if(list.get(curr)%10==6)
			{
				long val1=list.get(curr)*10+5;
				long val2=list.get(curr)*10+6;
				long val3=list.get(curr)*10+7;
				
				list.add(val1);
				list.add(val2);
				list.add(val3);
				
				curr++;
			}
			else if(list.get(curr)%10==7)
			{
				long val1=list.get(curr)*10+6;
				long val2=list.get(curr)*10+7;
				long val3=list.get(curr)*10+8;
				
				list.add(val1);
				list.add(val2);
				list.add(val3);
				
				curr++;
			}
			else if(list.get(curr)%10==8)
			{
				long val1=list.get(curr)*10+7;
				long val2=list.get(curr)*10+8;
				long val3=list.get(curr)*10+9;
				
				list.add(val1);
				list.add(val2);
				list.add(val3);
				
				curr++;
			}
			else if(list.get(curr)%10==9)
			{
				long val1=list.get(curr)*10+8;
				long val2=list.get(curr)*10+9;
				
				list.add(val1);
				list.add(val2);
				
				curr++;
			}
		}
		
		System.out.println(list.get(k));
		
	}
	
}