import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int cases;
		cases = Integer.parseInt(scn.nextLine());
		String data = "";
		String[] temp;
		StringBuffer buf = new StringBuffer();
		for(int i=0;i<cases;i++)
		{
			data = scn.nextLine();
			if(data.contains("insert"))
			{
				temp = data.split(" ");
				buf.insert(0, temp[1] + " ");
			}else if(data.contains("deleteFirst"))
			{
				temp = buf.toString().split(" ");
				buf = new StringBuffer();
				for(int j=1;j<temp.length;j++)
				{
					if(j == temp.length-1)
						buf.append(temp[j]);
					else
						buf.append(temp[j] + " ");
				}
			}else if(data.contains("deleteLast"))
			{
				temp = buf.toString().split(" ");
				buf = new StringBuffer();
				for(int j=temp.length-2;j>=0;j--)
				{
					if(j == temp.length-2)
						buf.insert(0, temp[j]);
					else
						buf.insert(0, temp[j] + " ");
				}
			}else
			{
				temp = data.split(" ");
				if(buf.toString().contains(temp[1]))
				{
					String testString = temp[1];
					temp = buf.toString().split(" ");
					buf = new StringBuffer();
					for(int j=0;j<temp.length;j++)
					{
						if(temp[j].equals(testString))
							continue;
						if(j == temp.length-1)
							buf.append(temp[j]);
						else
							buf.append(temp[j] + " ");
					}
				}
			}
		}
		System.out.println(buf);
		scn.close();
	}
}

