import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[])throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int[] ball = {1,0,0};
		String line;
		String[] splitLine;
		int tmp;
		int[] change = new int[2];
		
		while(true){
			line = br.readLine();
			if(line == null || line.isEmpty()){
				break;
			}
			splitLine = line.split(",");
			if(splitLine[0].equals("A")){
				change[0] = 0;
			}else if(splitLine[0].equals("B")){
				change[0] = 1;
			}else{
				change[0] = 2;
			}
			
			if(splitLine[1].equals("A")){
				change[1] = 0;
			}else if(splitLine[1].equals("B")){
				change[1] = 1;
			}else{
				change[1] = 2;
			}
			
			tmp = ball[change[0]];
			ball[change[0]] = ball[change[1]];
			ball[change[1]] = tmp;
		}
		
		if(ball[0] == 1){
			System.out.println("A");
		}else if(ball[1] == 1){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
	}
}