import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int[] inputNum = new int[100];
		int max=0;
		String line = "NA";
		
		for(int i=0;i<100;i++){
			inputNum[i] = 0;
		}
		
		while(true){
			line = br.readLine();
			if(line==null || line.isEmpty()){
				break;
			}
			if(!line.equals("")){
				inputNum[Integer.parseInt(line)-1]++;
			}
		}
		
		for(int i=1;i<100;i++){
			if(max < inputNum[i]){
				max = inputNum[i];
			}
		}
		
		for(int i=0;i<100;i++){
			if(inputNum[i] == max){
				System.out.println(i+1);
			}
		}
	}
}