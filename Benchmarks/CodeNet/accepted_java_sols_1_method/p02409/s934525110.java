import java.io.*;
import java.io.IOException;

class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int  n									//入力件数
			,b									//棟
			,f									//階
			,r									//部屋
			,v;									//入居者
		int[][][] house = new int[4][3][10]; 	
			
		try{
			//入力件数の入力
			n = Integer.parseInt(br.readLine());
		}catch(IOException e){
			System.out.println(e);
			return;
		}
		
		String[] input = new String[n];
		String output = "";
		
		for(int i=0;i<n;i++){
			try{
				//各情報の入力
				input = br.readLine().split("[\\s]+");
				b = Integer.parseInt(input[0]);
				f = Integer.parseInt(input[1]);
				r = Integer.parseInt(input[2]);
				v = Integer.parseInt(input[3]);
				
				house[b-1][f-1][r-1] += v;
				
			}catch(IOException e){
				System.out.println(e);
				return;
			}
		}
		
		//出力
		for(b=0;b<4;b++){
			for(f=0;f<3;f++){
				for(r=0;r<10;r++){
					output += " " + house[b][f][r];
				}
				System.out.println(output);
				output = "";
			}
			if(b<3)System.out.println("####################");
		}
		
	}
}

