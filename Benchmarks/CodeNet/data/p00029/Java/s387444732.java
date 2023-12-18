import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String str = br.readLine();
		String[] s = str.split(" ");
		Arrays.sort(s);
		int maxcount=0, maxidx=0;
		for(int i = 0; i< s.length;){
			int dx=1;
			int count=1;
			while(true){
				if(i+dx==s.length)
					break;
				if(s[i].equals(s[i+dx])){
					count++;
					dx++;
				}
				else{
					break;
				}
				
			}
			if(maxcount < count){
				maxcount=count;
				maxidx = i;
			}
			i += dx;
		}
		System.out.print(s[maxidx] + " " );
		int maxlength=0;
		for(int i = 0; i < s.length;i++){
			if(maxlength < s[i].length()){
				maxlength = s[i].length();
				maxidx = i;
			}
		}
		System.out.println(s[maxidx]);
	}

}