import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			//String tmp = br.readLine();
			int sum = 0;
			int firstIndex = -1;
			StringBuffer str = new StringBuffer();
			for(int i = 0; i < 8; i++){
				str.append(br.readLine());
			}
			//System.out.println(str);
			for(int i = 0; i < 64; i++){
				if(str.charAt(i) == '1'){
					sum += i;
					if(firstIndex < 0){
						firstIndex = i;
					}
				}
			}
			//System.out.println(sum);
			char type;
			if(sum == firstIndex*4 + 1 + 8 + 9){
				type = 'A';
			}
			else if(sum == firstIndex*4 + 8 + 16 + 24){
				type = 'B';
			}
			else if(sum == firstIndex*4 + 1 + 2 + 3){
				type = 'C';
			}
			else if(sum == firstIndex*4 + 7 + 8 + 15){
				type = 'D';
			}
			else if(sum == firstIndex*4 + 1 + 9 + 10){
				type = 'E';
			}
			else if(sum == firstIndex*4 + 8 + 9 + 17){
				type = 'F';
			}
			else {
				type = 'G';
			}
			
			System.out.println(type);
			String tmp = br.readLine();
			if(tmp == null){
				break;
			}
		}
	}

}