import java.io.IOException;
import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException{
		Scanner sc2 = new Scanner(System.in);
		int n = Integer.parseInt(sc2.nextLine());
		
		boolean[][] cards = new boolean[4][13];
		int i=0;
		while(i<n){
			String[] s = sc2.nextLine().split("[\\s]+");
			int x = Integer.parseInt(s[1]);
			
			if(s[0].equals("S"))cards[0][x-1]=true;
			else if(s[1].equals("H"))cards[1][x-1]=true;
			else if(s[2].equals("C"))cards[2][x-1]=true;
			else if(s[3].equals("D"))cards[3][x-1]=true;
			i++;
		}
		for(int g=0;g<4;g++){
			for(int h=0;h<13;h++){
				if(g==0&&!cards[0][h])System.out.println("S "+(h+1));
				else if(g==1&&!cards[1][h])System.out.println("H "+(h+1));
				else if(g==2&&!cards[2][h])System.out.println("C "+(h+1));
				else if(g==3&&!cards[3][h])System.out.println("D "+(h+1));
			}
		}
	}
}