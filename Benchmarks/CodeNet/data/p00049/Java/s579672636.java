import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] splitLine = new String[2];
		int[] blood = {0,0,0,0};
		while(true){
			line = br.readLine();
			if(line == null || line.isEmpty()){
				break;
			}
			splitLine = line.split(",");
			if(splitLine[1].equals("A")){
				blood[0] ++;
			}else if(splitLine[1].equals("B")){
				blood[1] ++;
			}else if(splitLine[1].equals("AB")){
				blood[2] ++;
			}else if(splitLine[1].equals("O")){
				blood[3] ++;
			}
		}
		
		for(int i=0;i<4;i++){
			System.out.println(blood[i]);
		}
	}
}