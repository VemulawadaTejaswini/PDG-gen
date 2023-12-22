import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line;
		double max=0,min=0;
		double mountain;
		boolean first = false;
		
		while(true){
			line = br.readLine();
			if(line == null || line.isEmpty()){
				break;
			}
			mountain = Double.parseDouble(line);
			if(first){
				if(max < mountain){
					max = mountain;
				}
				if(min > mountain){
					min = mountain;
				}
			}else{
				max = mountain;
				min = mountain;
				first = true;
			}
		}
		
		mountain = Math.ceil((max - min)*10)/10;
		System.out.println(mountain);
	}
}