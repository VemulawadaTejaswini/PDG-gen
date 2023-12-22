import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		while(true)
		{
			String word=input.nextLine();
			if(word.equals("-"))
				break;
			int wrapTime=input.nextInt();
			for(int i=0;i<wrapTime;i++)
			{
				int index=input.nextInt();
				String move=word.substring(0,index);
				String left=word.substring(index);
				word=left+move;
				
			}
			input.nextLine();
			System.out.println(word);
		}
	}

}

