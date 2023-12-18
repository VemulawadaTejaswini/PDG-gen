import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;


class Main {
	public static void main(String[] args) throws IOException {
		DecimalFormat df1 = new DecimalFormat("0.000000");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> iL = new ArrayList<Integer>();
		while(true){
			String s1 = new String(in.readLine());
			if(s1.equals("0")){
				break;
			}
			int num = Integer.parseInt(s1);
			String s2 = new String(in.readLine());
			String[] s2s = s2.split(" ");
			int sum = 0;
			for(int i = 0; i < s2s.length; i++){
				sum = sum + Integer.parseInt(s2s[i]);
			}
			iL.add(sum/(num-1));
		}
		for(Integer i : iL){
		
			System.out.println(i);
		}
		
	}

}