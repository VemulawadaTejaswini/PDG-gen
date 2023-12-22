import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력
		String s = br.readLine();
		boolean firstA = false;
		boolean thirdC = false;
		boolean hasOtherCapital = false;
		int aCount = 0;
		int cCount = 0;
		
		if(s.length() >= 4 && s.length() <=10){
			for(int i = 0 ; i < s.length() ; i++){
				switch(s.charAt(i)){
				case 'A':
					aCount++;
					if(i == 0){
						firstA = true;
					}
					break;
				case 'C':
					cCount++;
					if(i > 1 && i < s.length()-1){
						thirdC = true;
					}
					break;
				default:
					if(s.charAt(i) > 65 && s.charAt(i) <= 90){
						hasOtherCapital = true;
					}
				}
			}
			
			if(firstA == true && thirdC == true && cCount == 1 && hasOtherCapital == false){
				bw.write("AC");
				bw.flush();
			}else{
				bw.write("WA");
				bw.flush();
			}
		}else{
			bw.write("WA");
			bw.flush();
		}
		
		bw.close();
		br.close();
	}
}