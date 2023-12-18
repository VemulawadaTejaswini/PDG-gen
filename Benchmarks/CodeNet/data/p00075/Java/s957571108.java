import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[])throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line;
		String[] input = new String[3];
		double[] data = new double[3];
		boolean noOutput = true;
		
		while(true){
			line = br.readLine();
			if(line==null || line.isEmpty()){
				break;
			}
			input= line.split(",");
			for(int i=0;i<3;i++){
				data[i] = Double.parseDouble(input[i]);
			}
			
			System.out.println("t");
			if(data[1]/(data[2]*data[2]) >= 25.0){
				System.out.println((int)data[0]);
				noOutput = false;
			}
		}
		
		if(noOutput){
			System.out.println("該当なし");
		}
	}
}