import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String steps = br.readLine();
		boolean often_pattern = true;

		for(int i = 1; i <= steps.length(); i++){
			char step = steps.charAt(i-1);
			if(i % 2 == 0){
				if(step == 'R'){
					often_pattern = false;
					break;
				}
			} else {
				if(step == 'L'){
					often_pattern = false;
					break;
				}
			}
		}

		String answer;
		if(often_pattern){
			answer = "Yes";
		} else {
			answer = "No";
		}
		System.out.println(answer);
	}
}