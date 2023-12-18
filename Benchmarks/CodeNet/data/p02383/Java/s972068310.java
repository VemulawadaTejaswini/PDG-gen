import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] dice=new int[6];
		int[] nwse={1,5,4,2,3};
		String[] str=br.readLine().split(" ");//diceの配列に面の値を読み込む
		for(int i=0;i<6;i++){
			dice[i]=Integer.parseInt(str[i]);
		}
		String a=br.readLine();
		char dis[]=a.toCharArray();//読み込んだ方角推移をchar型のdis[]に格納
		for(int i=0;i<a.length();i++){
			nwse=rolling(dis[i],nwse);
		}
		System.out.println(dice[nwse[0]-1]);
	}
		
		
	public static int[] rolling(char b,int nwse[]){
			int p=0,q=0;
			switch (b){
			case 'S':
				{p=3;q=1;break;}
			case 'W':
				{p=2;q=4;break;}
			case 'N':
				{p=1;q=3;break;}
			case 'E':
				{p=4;q=2;break;}
			default:
					System.out.println("その方角は受け入れられません");
			}
			nwse[p]=nwse[0];nwse[0]=nwse[q];nwse[q]=7-nwse[p];
			return nwse;
	}
}