import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static String input;
	static int targetindex;
	static boolean debug = false;
	
	static class Segment
	{
		boolean issimple = false;
		String simplecontent = "";
		ArrayList<Segment> subsegs = new ArrayList<Segment>();
		ArrayList<Integer> times = new ArrayList<Integer>();
//		BigInteger length = new BigInteger("0");
		
//		String tempcont;
		
//		int id = (int) (Math.random()*1000);
		
		
		String getOf(int index)
		{
			int segs = subsegs.size();
			
			if(issimple)
			{
				if(index >= simplecontent.length())return "0";
				return simplecontent.substring(index, index+1);
			}
			
			int reducedindex = index;
			for(int cursegid = 0; cursegid < segs; cursegid++)
			{
				Segment curseg = subsegs.get(cursegid);
				int thislength = curseg.getlength();
				int thiscost = thislength * times.get(cursegid);
				
//				System.out.println("remaining: " + reducedindex + " SEGMENT " + cursegid + " LENGTH: " + (thiscost) + ":   [" + curseg.tempcont);
				
				if(reducedindex >= thiscost)
				{
					//not this segment, move on
					reducedindex -= thiscost;
				}
				else
				{
					//within this segment
//					System.out.println(": SEGMENT " + cursegid + ", I " + reducedindex);
					reducedindex = reducedindex%thislength;
					if(reducedindex < 0)reducedindex += thislength;
					
					
					return curseg.getOf(reducedindex);
				}
				
				
				
			}
			
			
			
			return "0";
		}
		
		public int getlength()
		{ //returns a max of 1000001
			if(issimple)
			{
//				System.out.println("SIMPLE COUNT " + simplecontent);
				return simplecontent.length();
			}			
			
			int segs = subsegs.size();
			int ans = 0;
			for(int cursegid = 0; cursegid < segs; cursegid++)
			{
				Segment curseg = subsegs.get(cursegid);
				
				ans += curseg.getlength() * times.get(cursegid);
				
//				System.out.println("[" + id + "] count " + ans);
				
				if(ans >= 1000001) {return 1000001;}
			}
			
//			System.out.println("[" + id + "] count " + ans + "              " + subsegs.size() + " " + times.get(0));
			return ans;
		}
		
		public Segment(String content)
		{
			//we only need the first 1000000 chars!
//			tempcont = content;
//			System.out.println(id + ": " + content);
			
			int curdepth = 0;
			int outermostparstart = 0;

			int numberstart = -1;
			
			int simplesegmentstart = 0; //ends when you hit a number, i guess.
			int reps = -1;
			
			issimple = true;
			
			for(int i = 0; i < content.length(); i++)
			{
				String cur = content.substring(i, i+1);
				char curc = content.charAt(i);
				
				if(curc >= 48 && curc <= 57)
				{
					issimple = false;
					if(curdepth == 0)
					{
						simplesegmentstart = i+1;						
						if(numberstart == -1)
						{
							numberstart = i;
						}
						
						if(!(content.charAt(i+1) >= 48 && content.charAt(i+1) <= 57))
						{
							reps = Integer.parseInt(content.substring(numberstart,i+1));
//							System.out.println("reps " + reps);
							numberstart = -1;
						}
					}
				}
				else if(cur.equals("("))
				{
					issimple = false;
					if(curdepth == 0)
					{
						outermostparstart = i;
					}
					curdepth += 1;
				}
				else if(cur.equals(")"))
				{
					curdepth -= 1;
					
					if(curdepth == 0)
					{					
						String minicontent = content.substring(outermostparstart+1, i);
						if(debug)System.out.println(reps + " repetitions of " + minicontent);
						
						subsegs.add(new Segment(minicontent));
						times.add(reps);
						simplesegmentstart = i+1;						
						
						reps = -1;
					}
				}
				else
				{ //letters
					if(curdepth == 0)
					{
						if(reps > 0 && i > 0 && content.charAt(i-1) >= 48 && content.charAt(i-1) <= 57 )
						{ //repetition of single letters
							if(debug)System.out.println(reps + " repetitions of letter " + cur + ",         content[" + content);
							
							subsegs.add(new Segment(cur));
							times.add(reps);
							simplesegmentstart = i+1;						
							
							reps =  -1;
						}
						else
						{ //plain letters
							if(reps == -1 && (i == content.length()-1 || !(content.charAt(i+1) >= 65 && content.charAt(i+1) <= 90)) && !(simplesegmentstart == 0 && i == content.length()-1) )
							{ //last letter in the plain text
								String simplesegstr = content.substring(simplesegmentstart, i+1);
								
								subsegs.add(new Segment(simplesegstr));
								times.add(1);
								simplesegmentstart = i+1;						
								
								if(debug)System.out.println("Added simple segment " + simplesegstr + "              content[" + content);
								
							}
						}
					}
				}
			}
			
			if(issimple)
			{
				simplecontent = content;
			}
			
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			input = scan.next();
			targetindex = scan.nextInt();
			
			if(input.equals("0") && targetindex == 0)return;
			
			Segment seg = new Segment(input);
			
//			System.out.println("total length " + seg.getlength());
			if(debug)System.out.println("ANS: ");
			System.out.println(seg.getOf(targetindex));
		}
	}

}

