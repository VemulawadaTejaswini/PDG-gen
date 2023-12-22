import java.io.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String[]scoreAstr=str.split(" ");
		str=br.readLine();
		String[]scoreBstr=str.split(" ");
		int[]scoreA=new int[4];
		int[]scoreB=new int[4];
		for(int i=0;i<4;i++){
			scoreA[i]=Integer.parseInt(scoreAstr[i]);
			scoreB[i]=Integer.parseInt(scoreBstr[i]);
		}
		int tscoreA=0;
		int tscoreB=0;
		for(int score:scoreA)
			tscoreA+=score;
		for(int score:scoreB)
			tscoreB+=score;
		if(tscoreA<tscoreB)
			System.out.println(tscoreB);
		else
			System.out.println(tscoreA);
	}
}