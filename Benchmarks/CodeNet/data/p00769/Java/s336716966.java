
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			new DataSet();
		}
	}
	
	
	static class DataSet
	{
		String content;
		District country = new District();
		
		public DataSet()
		{
			content = scan.next();
			
			buildData();
		}
		
		void buildData()
		{
			District[] lastDistrictOfDepth = new District[100];
			int startOfDistrict = 0;
			int endOfDistrict;
			int depth = -1;
			
			lastDistrictOfDepth[0] = country;
			
//			System.out.println("START");
			
			for(int i = 0; i < content.length(); i++)
			{
				String curChar = content.substring(i, i+1);
				District districtToLoad;
				
				if(curChar.equals("["))
				{
					depth += 1;
					startOfDistrict = i+1;
					
					lastDistrictOfDepth[depth] = new District();
					
//					System.out.println("NEW DISTRICT OF DEPTH " + depth);
				}
				
				if(curChar.equals("]"))
				{
//					districtToLoad
					endOfDistrict = i-1;
					
					District leDis = lastDistrictOfDepth[depth];
					
					//set pop
					if(leDis.children.size() == 0)
					{
						String districtPopS = content.substring(startOfDistrict, endOfDistrict+1);
//						System.out.println(districtPopS);
						int pop = Integer.parseInt(districtPopS);
						leDis.pop = pop;
					}
					else
					{
//						System.out.println("C " + leDis.children);
					}
					
					//add this district as a child to its parents
					if(depth > 0)
					{
						District parent = lastDistrictOfDepth[depth-1];
						
						parent.children.add(leDis);
						leDis.parent = parent;
					}
					else
					{
						System.out.println("" + lastDistrictOfDepth[0].getMinVotes());
					}
					
					depth -= 1;
				}
			}
		}
	}
	
	static class District
	{
		int pop;
		List<District> children = new ArrayList<District>();
		District parent;
		
		public District()
		{
		}
		
		public District(int pop)
		{
			this.pop = pop;
		}
		
		boolean isLowest()
		{
//			System.out.println("Lowest? Children " + children.size());
			if(children.size() == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		int getPopulation()
		{
			if(isLowest())
			{
				return pop;
			}
			else
			{
				return 0;
			}
		}
		
		int getMinVotes()
		{
//			return (int)(Math.floor(getPopulation()/2)) + 1;
			if(isLowest())
			{
				return (getPopulation()/2)+1;
			}
			else
			{
				List<District> tempChildren = new ArrayList<District>();
				tempChildren.addAll(children);
				
				int districtsNeeded = (children.size() / 2) + 1;
				int minVotes = 0;
				for(int i = 0; i < districtsNeeded; i++)
				{
					int minPop = -1;
					District smolDistrict = null;
					
					//pick out child with least pop
					for(District child : tempChildren)
					{
						int lePop = child.getMinVotes();
								
						if(lePop < minPop || minPop == -1)
						{
							minPop = lePop;
							smolDistrict = child;
						}
					}
					
					minVotes += minPop;
					tempChildren.remove(smolDistrict);
					
//					System.out.println("Counting... [" + i + "] " + minPop);
//					System.out.println("Size " + tempChildren.size());
				}
				
//				System.out.println("MV " + minVotes);
				return minVotes;		
			}
		}
	}
}

