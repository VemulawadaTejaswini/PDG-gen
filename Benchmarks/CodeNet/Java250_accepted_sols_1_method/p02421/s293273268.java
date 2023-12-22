import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int cards = scan.nextInt();
		String[] cardA = new String[cards];
		String[] cardB = new String[cards];
		int scoreA = 0;
		int scoreB = 0;
		for(int i = 0;i < cards;i++)
		{
			cardA[i] = scan.next();
			cardB[i] = scan.next();
			
			if(cardA[i].compareTo(cardB[i]) > 0) //winner:A
			{
				scoreA += 3;
			}else if(cardA[i].compareTo(cardB[i]) < 0){ //winner:B
				scoreB += 3;
			}else{ //drrow
				scoreA += 1;
				scoreB += 1;
			}
		}
		System.out.println(scoreA + " " + scoreB);
	}
}