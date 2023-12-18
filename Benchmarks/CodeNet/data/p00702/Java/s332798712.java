
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);
	static List<String> lines = new ArrayList<String>();
	static int numOfLines;
	static int[][] pairing = new int[38][38];

	public static void main(String[] args) 
	{

		
		numOfLines = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < numOfLines; i++)
		{
			
			String line = scan.nextLine();
			String newLine = "";
//			System.out.println(line);
			
			for(int j = 0; j < line.length(); j++)
			{
				//replace 2-width chars
				String cur = line.substring(j, j+1);
				String cur2;
				if(j < line.length()-1) {cur2 = line.substring(j, j+2);}else {cur2 = "";}
				
				if(cur.equals(" "))
				{
					newLine += " ";
				}
				else if(cur2.equals("ld"))
				{
					newLine += "1";
					j += 1;
				}
				else if(cur2.equals("mb"))
				{
					newLine += "2";
					j += 1;
				}
				else if(cur2.equals("mp"))
				{
					newLine += "3";
					j += 1;
				}
				else if(cur2.equals("nc"))
				{
					newLine += "4";
					j += 1;
				}
				else if(cur2.equals("nd"))
				{
					newLine += "5";
					j += 1;
				}
				else if(cur2.equals("ng"))
				{
					newLine += "6";
					j += 1;
				}
				else if(cur2.equals("nt"))
				{
					newLine += "7";
					j += 1;
				}
				else if(cur2.equals("nw"))
				{
					newLine += "8";
					j += 1;
				}
				else if(cur2.equals("ps"))
				{
					newLine += "9";
					j += 1;
				}
				else if(cur2.equals("qu"))
				{
					newLine += "0";
					j += 1;
				}
				else if(cur2.equals("cw"))
				{
					newLine += "!";
					j += 1;
				}
				else if(cur2.equals("ts"))
				{
					newLine += "?";
					j += 1;
				}
				else
				{
					newLine += line.substring(j,j+1);
				}
//				System.out.println("j = " +j + ": " + newLine + ", " + cur2);
			}
			
//			System.out.println("REPLINE " + newLine);
			
			lines.add(newLine);
		}
		
		
		
		for(int i = 0; i < numOfLines; i++)
		{
			String line = lines.get(i);
			
			for(int j = 0; j < line.length()-1; j++)
			{
				//check for pairs
				String cur = line.substring(j, j+1);
				String cur2 = line.substring(j, j+2);
				String sec = line.substring(j+1, j+2);
				
				if(cur.equals(" ") || sec.equals(" "))
				{
					
				}
				else
				{
					if(getKanCode(cur) > 0 && getKanCode(sec) > 0)
					{
						pairing[getKanCode(cur)-1][getKanCode(sec)-1] += 1;
//						System.out.println("Found pairing " + cur2 + ", ids " + (getKanCode(cur)-1) + " and " + (getKanCode(sec)-1));
//						System.out.println("ahem " + cur + " " + cur2);
//						j += 1;
					}
					else
					{
						System.out.println("ERROR WITH [" + cur2 + "]");
					}
				}
				
				
			}
		}
		
		for(int i = 0; i < 38; i++)
		{
			int bestID = 0;
			int best = 0;
			for(int j = 0; j < 38; j++)
			{
				if(pairing[i][j] > best)
				{
					best = pairing[i][j];
					bestID = j;
				}
			}
			System.out.println(getAlphaKanOfIndex(i) + " " + getAlphaKanOfIndex(bestID) + " " + best);
		}
		
	}
	
	static String getAlphaKanOfIndex(int i)
	{
		if(i >= 0 && i <= 25)
		{
			int j = i+97;
			char ch = (char) j;
			String ans = "";
			ans += ch;
			return ans;
		}
		if(i==26) {return"ld";}
		if(i==27) {return"mb";}
		if(i==28) {return"mp";}
		if(i==29) {return"nc";}
		if(i==30) {return"nd";}
		if(i==31) {return"ng";}
		if(i==32) {return"nt";}
		if(i==33) {return"nw";}
		if(i==34) {return"ps";}
		if(i==35) {return"qu";}
		if(i==36) {return"cw";}
		if(i==37) {return"ts";}

		return "";
	}
	
	static String getAlpha(String kanCode)
	{
		if(kanCode.length() == 1 && kanCode.charAt(0) >= 97 && kanCode.charAt(0) >= 122)
		{
			return kanCode;
		}
		if(kanCode.equals(" ")){return kanCode;}
		if(kanCode.equals("1"))
		{
			return "ld";
		}
		if(kanCode.equals("2"))
		{
			return "mb";
		}
		if(kanCode.equals("3"))
		{
			return "mp";
		}
		if(kanCode.equals("4"))
		{
			return "nc";
		}
		if(kanCode.equals("5"))
		{
			return "nd";
		}
		if(kanCode.equals("6"))
		{
			return "ng";
		}
		if(kanCode.equals("7"))
		{
			return "nt";
		}
		if(kanCode.equals("8"))
		{
			return "nw";
		}
		if(kanCode.equals("9"))
		{
			return "ps";
		}
		if(kanCode.equals("0"))
		{
			return "qu";
		}
		if(kanCode.equals("!"))
		{
			return "cw";
		}
		if(kanCode.equals("?"))
		{
			return "ts";
		}


		return "";
	}
	
	static int getKanCode(String a)
	{
		if(a.charAt(0) >= 97 && a.charAt(0) <= 122)
		{
			return a.charAt(0) - 96;
		}
		if(a.charAt(0) >= 49 && a.charAt(0) <= 57)
		{
			return a.charAt(0) - 22;
		}
		if(a.equals("0"))
		{
			return 36;
		}
		if(a.equals("!"))
		{
			return 37;
		}
		if(a.equals("?"))
		{
			return 38;
		}
		
		return 0;
	}
	
}

