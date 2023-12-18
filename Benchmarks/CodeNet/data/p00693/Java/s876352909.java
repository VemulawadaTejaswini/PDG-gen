
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
			ArrayList<Rule> permits = new ArrayList<Rule>();
			ArrayList<Rule> denies = new ArrayList<Rule>();
			ArrayList<String> okpacks = new ArrayList<String>();
			
			if(ruleNum == 0 && packNum == 0)
			{
				break;
			}
			
			for(int i = 0; i < ruleNum; i++)
			{
				String type = scan.next();
				if(type.equals("permit"))
				{
					permits.add(new Rule(scan.next(), scan.next()));
				}
				
				if(type.equals("deny"))
				{
					denies.add(new Rule(scan.next(), scan.next()));
				}
			}
			
			for(int i = 0; i < packNum; i++)
			{
				String ip1 = scan.next();
				String ip2 = scan.next();
				String content = scan.next();
				
				boolean hasPermit = false;
				boolean denied = false;
				
				for(Rule perm : permits)
				{
					if(perm.ip1matches(ip1) && perm.ip2matches(ip2))
					{
						//permitted by this rule
						hasPermit = true;
						break;
					}
				}
				
				if(hasPermit)
				{
					for(Rule deny : denies)
					{
						if(deny.ip1matches(ip1) && deny.ip2matches(ip2))
						{
							//denied by this rule
							denied = true;
							break;
						}
					}
					
					if(denied == false)
					{
						okpacks.add(ip1 + " " + ip2 + " " + content);
					}
				}
				else
				{
					//no permit: illegal
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
		
		public Rule(String ip1, String ip2)
		{
			this.ip1 = ip1;
			this.ip2 = ip2;
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

