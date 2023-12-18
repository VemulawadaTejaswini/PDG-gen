import java.io.*;

public class Main{
	
	static int num = 0;	//Number of Combination
	
	public static void calcNum(int value, int remNum){	//Number of remaining factors
		if(remNum == 1){
			num++;
		}else{
			for(int i=0; i<10; i++){
				if(value-i < 0)break;
				if((value-i) < 9 * (remNum-1)){
					calcNum(value-i, remNum-1);
				}else if((value-i) == 9 * (remNum-1)) num++;
			}
		}
	}
	
	public static void main(String[] argv) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = br.readLine()) != null){
			int value = Integer.parseInt(line);
			calcNum(value, 4);
			System.out.print(Integer.toString(num)+"\n");
			num = 0;
		}
	}
}