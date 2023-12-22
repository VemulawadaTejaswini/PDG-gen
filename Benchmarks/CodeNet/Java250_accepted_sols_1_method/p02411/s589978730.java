import java.io.*;
import java.io.IOException;

class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int  	m,
				f,
				r,
				num=0;
		
		String[] input = new String[3];
		String[] grade = new String[50];
		
		try{
			input = br.readLine().split("[\\s]+");
			
			while(true){
				m = Integer.parseInt(input[0]);
				f = Integer.parseInt(input[1]);
				r = Integer.parseInt(input[2]);
				
				//終了判定
				if(m == -1 && f == -1 && r == -1){
					break;
				}
				
				//成績判定
				if(m < 0 || f < 0 || m + f < 30){
					grade[num] = "F";
				}else if(m + f < 50 && r < 50){
					grade[num] = "D";
				}else if(m + f < 65){
					grade[num] = "C";
				}else if(m + f < 80){
					grade[num] = "B";
				}else{
					grade[num] = "A";
				}
				num++;
				input = br.readLine().split("[\\s]+");
			}
		}catch(IOException e){
			System.out.println(e);
			return;
		}
		
		//出力
		for(int i=0;i<num;i++){
			System.out.println(grade[i]);
		}
		
	}
}

