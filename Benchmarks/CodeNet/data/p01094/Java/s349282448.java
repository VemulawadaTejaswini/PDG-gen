

import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		while(true)
		{
			int n = scan.nextInt();
			if(n != 0)
			{
				new DataSet(n);
			}
			else
			{
				return;
			}
		}
	}
	
	public static class DataSet
	{
		int no; //number of votes
		int[] vote = new int[26]; //Mr. A = 0, ... Mr. B = 1, ... //vote[0] = vote on A
		int ans;
		int firstPlaceVotes = 0;
		int firstPlaceHolder = -1;
		int secondPlaceVotes = 0;
		int secondPlaceHolder = -1;
		boolean answered = false;
		
		public DataSet(int n)
		{
			this.no = n;
			
			for(int i = 0; i < no; i++)
			{
				String svote = scan.next();
				int wildVotes = no - (i+1); //votes we don't know yet
				int cand = svote.charAt(0)-65;
				
				vote[cand] += 1;
				
//				if(cand != firstPlaceHolder)
				{
					if(vote[cand] > firstPlaceVotes)
					{
						//current first becomes second place if they're different
						if(firstPlaceHolder != cand)
						{
							secondPlaceHolder = firstPlaceHolder;
							secondPlaceVotes = firstPlaceVotes;
						}
						
						//guy becomes first place
						firstPlaceVotes = vote[cand];
						firstPlaceHolder = cand;
					}
					else if(vote[cand] > secondPlaceVotes && cand != firstPlaceHolder)
					{
						//update current second
						if(cand == firstPlaceVotes) {System.out.println("WUT");}
						secondPlaceHolder = cand;
						secondPlaceVotes = vote[cand];
					}
				}
				
				if(secondPlaceHolder>=0)secondPlaceVotes = vote[secondPlaceHolder];
				
//				System.out.println("first place " + firstPlaceHolder + ", " + firstPlaceVotes);
//				System.out.println("2nd place " + secondPlaceHolder + ", " + secondPlaceVotes);
//				System.out.println(wildVotes + " wild votes");
				
				if(firstPlaceVotes > secondPlaceVotes + wildVotes && answered == false)
				{
//					System.out.println("first place " + firstPlaceVotes);
//					System.out.println("2nd place " + secondPlaceVotes);
					//done
					int code = (firstPlaceHolder+65);
					char candChar = (char)code;
					System.out.println(candChar + " " + (i+1));
					
					answered = true;
				}
			}
			
			if(firstPlaceVotes == secondPlaceVotes)
			{
				//tie
				System.out.println("TIE");
				return;
			}
			else
			{
			}
		}
	}

}

