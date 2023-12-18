import java.io.*;
import java.io.IOException;

class Main{
	public static void main(String args[]){
		int[] flagArray = new int[52];
		int haveCard = 0;
		int num=0;
		String[] pattern = {"S","H","C","D"};
		String[] inp = new String[2];
		String ans="";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			
			haveCard = Integer.parseInt(br.readLine());
			
			for(int i=0;i<haveCard;i++){
				inp = br.readLine().split("[\\s]+");
				
				switch(inp[0]){
					case "S":
						num = Integer.parseInt(inp[1]);
						break;
					case "H":
						num = Integer.parseInt(inp[1])+13;
						break;
					case "C":
						num = Integer.parseInt(inp[1])+13*2;
						break;
					case "D":
						num = Integer.parseInt(inp[1])+13*3;
					default:
						throw new IOException("None of \"S\",\"H\",\"C\",\"D\"");
				}
				flagArray[num-1]=1;
			}
			
		}catch(IOException e){
			System.out.println(e);
		}
		for(int i=0;i<flagArray.length;i++){
			if(flagArray[i]==0){
				switch(i/13){
					case 0:
						ans ="S "+String.valueOf(i+1);
						break;
					case 1:
						ans ="H "+String.valueOf(i%13+1);
						break;
					case 2:
						ans ="C "+String.valueOf(i%13+1);
						break;
					case 3:
						ans ="D "+String.valueOf(i%13+1);
						
				}
				System.out.println(ans);
			}
		}
		
	}
}
