

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			int ruleNum = scan.nextInt();
			int packNum = scan.nextInt();
			ArrayList<Rule> rules = new ArrayList<Rule>();
//			ArrayList<Rule> permits = new ArrayList<Rule>();
//			ArrayList<Rule> denies = new ArrayList<Rule>();
			ArrayList<String> okpacks = new ArrayList<String>();
			
			if(ruleNum == 0 && packNum == 0)
			{
//				System.out.println("..... (terminated because of the limitation)");
				break;
			}
			
			for(int i = 0; i < ruleNum; i++)
			{
				String type = scan.next();
				if(type.equals("permit"))
				{
					rules.add(new Rule(scan.next(), scan.next(), i, 1));
				}
				
				if(type.equals("deny"))
				{
					rules.add(new Rule(scan.next(), scan.next(), i, 0));
				}
			}
			
			for(int i = 0; i < packNum; i++)
			{
				String ip1 = scan.next();
				String ip2 = scan.next();
				String content = scan.next();
				
				int status = 0;
				
				for(int r = 0; r < rules.size(); r++)
				{
					Rule rul = rules.get(r);
					
					if(rul.ip1matches(ip1) && rul.ip2matches(ip2))
					{
						//affected
						status = rul.type;
					}
				}
				
				if(status == 1)
				{
					okpacks.add(ip1 + " " + ip2 + " " + content);
				}
			}
			
			//print all okpacks
			System.out.println(okpacks.size());
			for(String pack : okpacks)
			{
				System.out.println(pack);
			}
		}
	}
	
	static class Rule
	{
		String ip1 = "";
		String ip2 = "";
		int index;
		int type;
		
		public Rule(String ip1, String ip2, int index)
		{
			this.ip1 = ip1;
			this.ip2 = ip2;
			this.index = index;
		}
		
		public Rule(String ip1, String ip2, int index, int type)
		{
			this.ip1 = ip1;
			this.ip2 = ip2;
			this.index = index;
			this.type = type;
		}
		
		boolean ip1matches(String enter)
		{
			for(int i = 0; i < ip1.length(); i++)
			{
				String curlet1 = ip1.substring(i, i+1);
				String curlet2 = enter.substring(i, i+1);
				
				if(!curlet1.equals(curlet2) && !curlet1.equals("?"))
				{
					return false;
				}
			}
			
			return true;
		}
		
		boolean ip2matches(String enter)
		{
			for(int i = 0; i < ip2.length(); i++)
			{
				String curlet1 = ip2.substring(i, i+1);
				String curlet2 = enter.substring(i, i+1);
				
				if(!curlet1.equals(curlet2) && !curlet1.equals("?"))
				{
					return false;
				}
			}
			
			return true;
		}
	}
}

