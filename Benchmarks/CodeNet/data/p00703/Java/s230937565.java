
import java.util.Scanner;

//FIX: Pay attention what the wild digits needs to be.
//They must not be used in different ways for the same could-be-answer.
//eliminate wild digit possibilities.
//Nah, thats not it.
//Maybe the blow counting is faulty.

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int l;
		int h;
		
		while(true)
		{
			l = scan.nextInt();
			h = scan.nextInt();
			
			if(l == 0 && h == 0)
			{
				break;
			}
			else
			{
				HintSet hs = new HintSet(l, h);
			}
		}
	}
	
	static class HintSet
	{
		int length;
		int hints;
		String satisfier;
		String[] guess;
		int[] hit;
		int[] blow;
		
		int possibilities = 0; // When it reaches more than 1 answer becomes NO, terminate all computation.

		
		void computeAll()
		{
			compute("0");
			compute("1");
			compute("2");
			compute("3");
			compute("4");
			compute("5");
			compute("6");
			compute("7");
			compute("8");
			compute("9");
		}
		
		boolean compute(String s)
		{
			if(possibilities < 2)
			{
				//check if it's possible.
				int curL = s.length();
				
				for(int i = 0; i < hints; i++)
				{
					
					//check hits.
					//if the answer really [starts with]/[is] s...
					
					int hitCount = 0;
					int blowCount = 0;
					
					for(int d = 0; d < s.length(); d++)
					{
						if(s.charAt(d) == guess[i].charAt(d))
						{
							hitCount += 1;
						}
						else
						{
							//check for blows (inefficient)
							//check if, the character exists at another place in guess[i]
							if(guess[i].contains( (""+s.charAt(d)) )   )
							{
								blowCount += 1;
							}
						}
					}
//					if(s.equals("638287")) {System.out.println("hint " + i + ", " + hitCount + " hits and " + blowCount + " blows");}
					
					//if the answer really [starts with]/[is] s...
					int zure = length - s.length(); //wild digits
					int usedZure = 0;
					
					//CHECK HITS
					{
						//we should at least have hit[i] - zure count of hits?
						if(hitCount < hit[i] - zure)
						{
							//no matter what the blanks are filled with,
							//(even if they're all hits)
							//we still won't have enough hits,
							//if this were the answer.
//							System.out.println("[1] Answer cant be " + s + " according to hint " + i);
							return false;
						}
						if(hitCount > hit[i])
						{
//							System.out.println("[2] Answer cant be " + s + " according to hint " + i);
							//overhit; even if they blanks were all non hits,
							//we already have too many hits.
							//(the actual answer is not as close to the 'try')
							return false;
						}
						
						usedZure = hit[i] - hitCount; //usedZure --> wild digits that have to be hits.
					}
					
					//CHECK BLOWS
					{
						zure -= usedZure;
						//zure is reduced by hits accordingly, since the wild digits can't fulfill both hit and blow at once.
						//zure right now is only wild digits that may fulfill blows.
						
						if(blowCount < blow[i] - zure)
						{
//							System.out.println("[1] Answer cant be " + s + " according to hint " + i);
							return false;
						}
						if(blowCount > blow[i])
						{
//							System.out.println("[2] Answer cant be " + s + " according to hint " + i);
							return false;
						}
						
					}
					//
				}
				
				//haven't returned false yet means it's still possible.
				
				if(curL == length)
				{
					//this could be the answer!!
					possibilities += 1;
					satisfier = s;
					
//					System.out.println("Answer could be " + s);
					return true;
				}
				else
				{
					//LATER: don't check impossible digits.
					for(int a = 0; a<= 9;a++)
					{
						String sa = Integer.toString(a);
						if(!s.contains(sa)) {compute(s + sa);}
						
					}
//					compute(s + "0");
//					compute(s + "1");
//					compute(s + "2");
				}
				
				return false;
			}
			else
			{
				return false;
			}
		}
		
		public HintSet(int l, int h)
		{
			length = l;
			hints = h;
			
			guess = new String[hints];
			hit = new int[hints];
			blow = new int[hints];
//			digits = new Digit[l];
			
			for(int i = 0; i < l; i++)
			{
				
			}
			
			for(int i = 0; i < h; i++)
			{
				guess[i] = scan.next();
				hit[i] = scan.nextInt();
				blow[i] = scan.nextInt();
			}
			
			computeAll();
			
			if(possibilities == 1)
			{
				System.out.println(satisfier);
			}
			else
			{
				System.out.println("NO");
			}
//			System.out.println(possibilities + " possibilities.");
		}
	}
}

