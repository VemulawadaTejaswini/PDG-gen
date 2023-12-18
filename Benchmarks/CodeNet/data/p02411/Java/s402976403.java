import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<int[]> aline = new ArrayList<int[]>();
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));;
		do {
			String linedata;
			try{
				linedata = buf.readLine();
			}catch(IOException e){
				System.err.println(e.toString());
				System.err.println("Input Error");
				continue;
			}
			int[] idata = splitdata(linedata);
			if (idata.length >= 3 && idata[0] == -1 && idata[1] == -1 && idata[2] == -1) break;
			aline.add(idata);
		}while(true);
		
		for (int i = 0; i < aline.size() ;i++){
			int[] t = aline.get(i);
			System.out.println(judgeData(t));
		}
	}
	
	static int[] splitdata(String indata){
		String[] sdata = indata.split(" ");
		int[] data = new int[sdata.length];
		for (int i = 0; i < sdata.length; i++){
			data[i] = Integer.parseInt(sdata[i]);
		}
		
		return data;
	}
	
	static char judgeData(int[] test){
		if (test[0] == -1 || test[1] == -1) return 'F';
		if (test[0] + test[1] >= 80) return 'A';
		if (test[0] + test[1] >= 65) return 'B';
		if (test[0] + test[1] >= 50) return 'C';
		if (test[0] + test[1] >= 30){
			if (test[2] >= 50) return 'C';
			else return 'D';
		}
		
		return 'F';
	}
	

}