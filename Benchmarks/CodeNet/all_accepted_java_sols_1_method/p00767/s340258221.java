
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		
		while(true)
		{
			int h = stdIn.nextInt();
			int w = stdIn.nextInt();
			
			if(h==0 && w==0)
			{
				break;
			}
			
			int diagonal = h*h+w*w;
			int i = 1;
			boolean flag = false;
			int diagonal_min = 100000;
			int h_min = 151;
			int w_min = 151;
			while(true)
			{
				for(int j = i+1;j<150;j++)
				{
					if((i!=h || j!=w) && diagonal == (i*i+j*j) && i>h)
					{
						System.out.println(i+" "+j);
						flag = true;
						break;
					}
					if(diagonal<(i*i+j*j) && (i*i+j*j)==diagonal && h_min>i && i>h)
					{
						h_min = i;
						w_min = j;
					}
					if(diagonal<(i*i+j*j) && (i*i+j*j)<diagonal_min )
					{
						diagonal_min = i*i+j*j;
						h_min = i;
						w_min = j;
						
					}
					
					if(j==i+1 && diagonal<(i*i+j*j))
					{
						System.out.println(h_min+" "+w_min);
						flag = true;
						break;
					}
					
				}
				if(flag)
				{
					break;
				}
				if(i==149)
				{
					System.out.println(h_min+" "+w_min);
					break;
				}
				i++;
			}
			
		}
	}

}