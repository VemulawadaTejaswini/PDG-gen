import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		String era = null;		// ??´???
		int eraYear = 0;		// ??´????????´??°
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(;;){
			String oneline = null;
			try {
				oneline = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			String[] line = oneline.split(" ");	// 0 -> ??´??????1 -> ??????2 -> ??\
			int[] d = {0};
			for(int i=0; i<line.length; i++){
				d[i] = Integer.parseInt(line[i]);
			}
			
			if(d[0]>=1990 || (d[0]==1989 && d[1]>=2) || (d[0]==1989 && d[1]==1 && d[2]>=8)){
				era = "heisei";
				eraYear = d[0]-1989+1;
				System.out.println(era+ " "+ eraYear+ " "+ d[1]+ " "+ d[2]);
			}
			else if(d[0]>=1927 || (d[0]==1926 && d[1]==12 && d[2]>=25) ){
				era = "showa";
				eraYear = d[0]-1926+1;
				System.out.println(era+ " "+ eraYear+ " "+ d[1]+ " "+ d[2]);
			}
			else if(d[0]>=1913 || (d[0]==1912 && d[1]>=8) || (d[0]==1912 && d[1]==7 && d[2]>=30)){
				era = "taisho";
				eraYear = d[0]-1912+1;
				System.out.println(era+ " "+ eraYear+ " "+ d[1]+ " "+ d[2]);
			}
			else if(d[0]>=1869 || (d[0]==1868 && d[1]>=10) || (d[0]==1868 && d[1]==9 && d[2]>=8)){
				era = "meiji";
				eraYear = d[0]-1868+1;
				System.out.println(era+ " "+ eraYear+ " "+ d[1]+ " "+ d[2]);
			}
			else{
				System.out.println("pre-meiji");
			}			
		}
	}

}