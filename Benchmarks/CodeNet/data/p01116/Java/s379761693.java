import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	static int[] curlvl;
	static int money;
	static long power = 0;
	
	static int[] maxlvl;
	static long[] importance;
	
	static int[] preid;
	static int[] prelvl;
	
	static boolean debug = false;
	
	static void learnskill(int id, int targetlevel)
	{
		if(id > 0 && curlvl[preid[id]] < prelvl[id])
		{ //learn the prerequisite first!
			learnskill(preid[id], prelvl[id]);
		}
		
		//learn this skill to the target level.
		if(debug)System.out.println("Skill " + id + " is now level " + targetlevel);
		power += (targetlevel - curlvl[id]) * importance[id];
		money -= targetlevel - curlvl[id];
		curlvl[id] = targetlevel;
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			int n = scan.nextInt(); //num of skills
			money = scan.nextInt();
			
			if(n == 0 && money == 0) return;
			
			int[] unlockcost = new int[n]; //cost to unlock the skill [i.e. learning all the prerequisites]
			long[] unlockpower = new long[n]; //power gotten on the way to unlock the skill
			
			power = 0;
			curlvl = new int[n];
			
			maxlvl = new int[n];
			importance = new long[n];
			
			preid = new int[n];
			prelvl = new int[n];
			
			int mostefficientskill = -1;
			double bestnetefficiency = 0; //power gotten per 1 money if we learn all the prerequisites then this skill as much as possible
			//limiters being money and max level of this skill
			
			
			for(int i = 0; i < n; i++)
				maxlvl[i] = scan.nextInt();
			for(int i = 0; i < n; i++)
				importance[i] = scan.nextInt();
				
			for(int i = 1; i < n; i++)
				preid[i] = scan.nextInt()-1;
			for(int i = 1; i < n; i++)
				prelvl[i] = scan.nextInt();
			
			int day = 0;
			while(true)
			{
				bestnetefficiency = 0;
				day += 1;
				if(debug)System.out.println("Current money: " + money + ", power: " + power);
				for(int i = 0; i < n; i++)
				{
					if(i > 0)
					{
						if(curlvl[preid[i]] >= prelvl[i])
						{ //already unlocked
							unlockcost[i] = 0;
							unlockpower[i] = 0;
						}
						else
						{
							int increaseprelevel = (prelvl[i] - curlvl[preid[i]]); //how many levels we need to raise the prereq skill
							if(increaseprelevel < 0) {increaseprelevel = 0;}
							
							unlockcost[i] = unlockcost[preid[i]] + increaseprelevel;
							unlockpower[i] = unlockpower[preid[i]] + (increaseprelevel * importance[preid[i]]);
							
							if(increaseprelevel == 0) {unlockpower[i] = 0;}
						}
					}
					
					
					double netefficiency;
					
					if(curlvl[i] < maxlvl[i])
					{
						if(money >= (maxlvl[i] - curlvl[i]) + unlockcost[i])
						{ //can max this skill
							netefficiency = (unlockpower[i] + (importance[i] * (maxlvl[i] - curlvl[i]))) / (unlockcost[i] + (maxlvl[i] - curlvl[i]));
							if(debug)System.out.println("Can max skill " + i + ": " + netefficiency + " LR: " + (importance[i] * (maxlvl[i] - curlvl[i])) + ", R: " + (unlockcost[i] + money));
						}
						else
						{ //only learn as much as budget allows
//							int levelstobelearned = money;
							if(money > unlockcost[i])
							{ //can actually learn the skill after unlocking it
								netefficiency = (unlockpower[i] + (importance[i] * money)) / (money);
								if(debug)System.out.println("Can levelup skill " + i + ", curlvl " + curlvl[i] + " max " + maxlvl[i] + ", ne " + netefficiency);
							}
							else
							{ //just learn the requirements!
								netefficiency = 0;
							}
						}
					}
					else
					{
						netefficiency = 0;
					}

					
					if(netefficiency >= bestnetefficiency)
					{
						bestnetefficiency = netefficiency;
						mostefficientskill = i;
					}					
				}
				
				if(debug)System.out.println("best net eff: " + bestnetefficiency + ", skill " + mostefficientskill + " imp " + importance[mostefficientskill] + ", which is at " + curlvl[mostefficientskill] + "/" + maxlvl[mostefficientskill]);
				if(debug)System.out.println("Unlock costs: " + Arrays.toString(unlockcost));
				if(debug)System.out.println("Unlock power: " + Arrays.toString(unlockpower));
				if(bestnetefficiency > 0 && mostefficientskill >= 0)
				{
					int highestlevelavailable = Math.min(maxlvl[mostefficientskill], curlvl[mostefficientskill] + (money - unlockcost[mostefficientskill]));
					learnskill(mostefficientskill, highestlevelavailable);
				}
				else
				{
					break;
				}
				
				if(money <= 0 || bestnetefficiency <= 0)break;
//				if(day > 5) {break;}//DISINI
				
				if(debug)System.out.println("Levels: " + Arrays.toString(curlvl));
				if(debug)System.out.println(power);				
			}
			if(debug)System.out.println("Money: " + money);
			if(debug)System.out.println("Levels: " + Arrays.toString(curlvl));
			if(debug)System.out.println("Unlock costs: " + Arrays.toString(unlockcost));
			if(debug)System.out.println("Unlock power: " + Arrays.toString(unlockpower));
			System.out.println(power);
		}
	}

}

