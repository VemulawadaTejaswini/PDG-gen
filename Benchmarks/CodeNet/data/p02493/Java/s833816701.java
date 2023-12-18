import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line=br.readLine();
		line=br.readLine();
		String[] nums=line.split(" ");
		line="";
		for(int n=nums.length-1;n>=0;n--){
			line+=nums[n]+" ";
		}
		System.out.println(line.substring(0,line.Lenth-2));
	}
}