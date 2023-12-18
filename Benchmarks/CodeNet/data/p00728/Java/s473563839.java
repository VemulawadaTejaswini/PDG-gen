import java.io.*;
public class Main{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i;
		int n;
		//int[] scores;
		int max;
		int min;
		int ave;
		int score;
		try{
			while(null != (line=reader.readLine())){
				n = Integer.parseInt(line);
				if(n==0)return;
				ave = 0;
				min = -1;
				max = -1;
				//scores = new int[n];
				for(i=0; i<n; i++){
					line = reader.readLine();
					score = Integer.parseInt(line);
					if(max < score){
						ave += (max<0)?0:max;
						if(max >= 0 && min < 0){
							min = max;
							ave -= max;
						}
						max = score;
					}else{
						if(min < 0){
							min = score;
						}else if(min > score){
							ave += (min<0)?0:min;
							min = score;
						}else{
							ave += score;
						}
					}
					System.out.println("("+min+";"+max+")");
				}
				ave = ave/(n-2);
				System.out.println(ave);
			}
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}