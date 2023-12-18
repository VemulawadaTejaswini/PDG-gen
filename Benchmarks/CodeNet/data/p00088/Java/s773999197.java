import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{		
			String input = scanner.nextLine();
			
			String sign = "";
			for(int i=0; i<input.length(); i++)
			{
				sign += toSign(input.substring(i, i+1));
			}
			if(sign.length()%5 != 0)
			{
				int s = sign.length()%5;
				for(int i=0; i<5-s; i++)
				{
					sign += "0";
				}
			}
			
			String output = "";
			for(int i=0; i<sign.length(); i+=5)
			{
				output += toChar(sign.substring(i, i+5));
			}
			
			System.out.println(output);
		}
	}
	
	static String toSign(String str)
	{
		switch(str)
		{
			case " ":
				return "101";
			case "'":
				return "000000";
			case ",":
				return "000011";
			case "-":
				return "10010001";
			case ".":
				return "010001";
			case "?":
				return "000001";
			case "A":
				return "100101";
			case "B":
				return "10011010";
			case "C":
				return "0101";
			case "D":
				return "0001";
			case "E":
				return "110";
			case "F":
				return "01001";
			case "G":
				return "10011011";
			case "H":
				return "010000";
			case "I":
				return "0111";
			case "J":
				return "10011000";
			case "K":
				return "0110";
			case "L":
				return "00100";
			case "M":
				return "10011001";
			case "N":
				return "10011110";
			case "O":
				return "00101";
			case "P":
				return "111";
			case "Q":
				return "10011111";
			case "R":
				return "1000";
			case "S":
				return "00110";
			case "T":
				return "00111";
			case "U":
				return "10011100";
			case "V":
				return "10011101";
			case "W":
				return "000010";
			case "X":
				return "10010010";
			case "Y":
				return "10010011";
			case "Z":
				return "10010000";
		}
		return "";
	}
	
	static String toChar(String str)
	{
		int n = 0;
		for(int i=0; i<str.length(); i++)
		{
			n += str.substring(str.length()-i-1, str.length()-i).equals("1") ? Math.pow(2, i) : 0;
		}
		if(n < 26)
		{
			return Character.toString((char)('A'+n));
		}
		else
		{
			switch (n)
			{
				case 26:
					return " ";
				case 27:
					return ".";
				case 28:
					return ",";
				case 29:
					return "-";
				case 30:
					return "'";
				case 31:
					return "?";
			}
		}
		
		return "";
	}
}