import java.util.Scanner;

public class Main 
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int i=0;
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==0)
				return;
			switch(n)
			{
			case 1:
			{
				System.out.println("Case "+(++i)+":");
				System.out.println("  1");
				break;
			}
			case 2:
			{
				System.out.println("Case "+(++i)+":");
				System.out.println("  1  2");
				System.out.println("  3  4");
				break;
			}
			case 3: 
			{
				System.out.println("Case "+(++i)+":");
				System.out.println("  1  2  6");
				System.out.println("  3  5  7");
				System.out.println("  4  8  9");
				break;
			}
			case 4:
			{
				System.out.println("Case "+(++i)+":");
				System.out.println("  1  2  6  7");
				System.out.println("  3  5  8 13");
				System.out.println("  4  9 12 14");
				System.out.println(" 10 11 15 16");
				break;
			}
			case 5:
			{
				System.out.println("Case "+(++i)+":");
				System.out.println("  1  2  6  7 15");
				System.out.println("  3  5  8 14 16");
				System.out.println("  4  9 13 17 22");
				System.out.println(" 10 12 18 21 23");
				System.out.println(" 11 19 20 24 25");
				break;				
			}
			case 6:
			{
				System.out.println("Case "+(++i)+":");
				System.out.println("  1  2  6  7 15 16");
				System.out.println("  3  5  8 14 17 26");
				System.out.println("  4  9 13 18 25 27");
				System.out.println(" 10 12 19 24 28 33");
				System.out.println(" 11 20 23 29 32 34");
				System.out.println(" 21 22 30 31 35 36");
				break;
			}
			case 7:
			{
				System.out.println("Case "+(++i)+":");
				System.out.println("  1  2  6  7 15 16 28");
				System.out.println("  3  5  8 14 17 27 29");
				System.out.println("  4  9 13 18 26 30 39");
				System.out.println(" 10 12 19 25 31 38 40");
				System.out.println(" 11 20 24 32 37 41 46");
				System.out.println(" 21 23 33 36 42 45 47");
				System.out.println(" 22 34 35 43 44 48 49");
				break;
			}
			case 8:
			{
				System.out.println("Case "+(++i)+":");
				System.out.println("  1  2  6  7 15 16 28 29");
				System.out.println("  3  5  8 14 17 27 30 43");
				System.out.println("  4  9 13 18 26 31 42 44");
				System.out.println(" 10 12 19 25 32 41 45 54");
				System.out.println(" 11 20 24 33 40 46 53 55");
				System.out.println(" 21 23 34 39 47 52 56 61");
				System.out.println(" 22 35 38 48 51 57 60 62");
				System.out.println(" 36 37 49 50 58 59 63 64");
				break;
			}
			case 9:
			{
				System.out.println("Case "+(++i)+":");
				System.out.println("  1  2  6  7 15 16 28 29 45");
				System.out.println("  3  5  8 14 17 27 30 44 46");
				System.out.println("  4  9 13 18 26 31 43 47 60");
				System.out.println(" 10 12 19 25 32 42 48 59 61");
				System.out.println(" 11 20 24 33 41 49 58 62 71");
				System.out.println(" 21 23 34 40 50 57 63 70 72");
				System.out.println(" 22 35 39 51 56 64 69 73 78");
				System.out.println(" 36 38 52 55 65 68 74 77 79");
				System.out.println(" 37 53 54 66 67 75 76 80 81");
				break;
			}
			}
		}
	}
}